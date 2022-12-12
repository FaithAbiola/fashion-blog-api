package com.faithabiola.fashionblogapi.controllers;

import com.faithabiola.fashionblogapi.dto.CommentCreationDto;
import com.faithabiola.fashionblogapi.services.CommentService;
import com.faithabiola.fashionblogapi.util.ApiResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/comment")
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/comment/{id}")
    public ApiResponse makeComment(@PathVariable("id") Long postId, @RequestBody CommentCreationDto commentCreationDto, HttpSession httpSession){
        return commentService.createComment(commentCreationDto, postId, httpSession);
    }
}
