package com.faithabiola.fashionblogapi.serviceimpl;

import com.faithabiola.fashionblogapi.dto.PostLikeResponseDto;
import com.faithabiola.fashionblogapi.entities.Post;
import com.faithabiola.fashionblogapi.entities.PostLike;
import com.faithabiola.fashionblogapi.entities.User;
import com.faithabiola.fashionblogapi.repositories.PostLikeRepository;
import com.faithabiola.fashionblogapi.repositories.PostRepository;
import com.faithabiola.fashionblogapi.repositories.UserRepository;
import com.faithabiola.fashionblogapi.services.PostLikeService;
import com.faithabiola.fashionblogapi.util.ApiResponse;
import com.faithabiola.fashionblogapi.util.ResponseManager;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PostLikeServiceImpl implements PostLikeService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;
    private final PostLikeRepository postLikeRepository;
    private final ResponseManager<PostLikeResponseDto> responseManager;
    private final ModelMapper mapper;
    @Override
    public ApiResponse<PostLikeResponseDto> likePost(Long postId, HttpSession httpSession) {
        User currentUser = (User) httpSession.getAttribute("currentUser");
        if (currentUser == null) {
            Optional<User> anonymous = userRepository.findById(2L);
            currentUser = anonymous.get();
        }
        Post post = postRepository.findById(postId).orElse(null);
        if(post == null)
            return responseManager.error("Post not valid or deleted", HttpStatus.BAD_REQUEST);
        PostLike postLike = new PostLike();
        postLike.setPost(post);
        postLike.setUser(currentUser);
        postLikeRepository.save(postLike);
        PostLikeResponseDto postLikeResponseDto = mapper.map(postLike, PostLikeResponseDto.class);
        return responseManager.success(postLikeResponseDto, HttpStatus.OK);
    }
}