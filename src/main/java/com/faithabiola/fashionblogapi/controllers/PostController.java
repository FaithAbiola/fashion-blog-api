package com.faithabiola.fashionblogapi.controllers;

import com.faithabiola.fashionblogapi.dto.PostCreationDto;
import com.faithabiola.fashionblogapi.dto.PostResponseDto;
import com.faithabiola.fashionblogapi.services.PostService;
import com.faithabiola.fashionblogapi.util.ApiResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/post")
public class PostController {

    private final PostService postService;

    @GetMapping("/")
    public String get(){
        return "Welcome here";
    }

    @PostMapping("/create_post")
    public ApiResponse<PostResponseDto> createPost(@RequestBody PostCreationDto postCreationDto, HttpSession httpSession) {
        return postService.createPost(postCreationDto, httpSession);
    }
}
