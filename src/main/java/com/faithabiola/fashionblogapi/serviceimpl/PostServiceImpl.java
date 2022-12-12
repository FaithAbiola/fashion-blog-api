package com.faithabiola.fashionblogapi.serviceimpl;

import com.faithabiola.fashionblogapi.dto.PostCreationDto;
import com.faithabiola.fashionblogapi.dto.PostResponseDto;
import com.faithabiola.fashionblogapi.entities.Post;
import com.faithabiola.fashionblogapi.entities.User;
import com.faithabiola.fashionblogapi.repositories.PostRepository;
import com.faithabiola.fashionblogapi.services.PostService;
import com.faithabiola.fashionblogapi.util.ApiResponse;
import com.faithabiola.fashionblogapi.util.ResponseManager;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import static org.springframework.http.HttpStatus.*;


@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final ModelMapper mapper;
    private final ResponseManager responseManager;
    private final PostRepository postRepository;

    @Override
    public ApiResponse<PostResponseDto> createPost(PostCreationDto postCreationDto, HttpSession httpSession) {
        User currentUser = (User) httpSession.getAttribute("currentUser");
        if (currentUser.getEmail().equalsIgnoreCase("faith.abiola@gmail.com")) {
            if (postCreationDto.getPost() == null)
                return responseManager.error("Post body cannot be empty", BAD_REQUEST);
            if (postCreationDto.getCategory() == null)
                return responseManager.error("Post category cannot be empty", BAD_REQUEST);
            postCreationDto.setUser(currentUser);

            Post post = mapper.map(postCreationDto, Post.class);
            Post savedPost = postRepository.save(post);

            PostResponseDto postResponseDto = mapper.map(savedPost, PostResponseDto.class);
            return responseManager.success(postResponseDto, OK);
        }
        return responseManager.error("Not Authorized", BAD_REQUEST);
    }
}
