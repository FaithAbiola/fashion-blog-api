package com.faithabiola.fashionblogapi.controllers;

import com.faithabiola.fashionblogapi.entities.PostLike;
import com.faithabiola.fashionblogapi.services.PostLikeService;
import com.faithabiola.fashionblogapi.util.ApiResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/like")
public class LikeController {

    private final PostLikeService postLikeService;

    @GetMapping("/like_post/{id}")
    public ApiResponse<PostLike> get(@PathVariable("id") Long commentId, HttpSession httpSession){
        return postLikeService.likePost(commentId, httpSession);
    }
}
