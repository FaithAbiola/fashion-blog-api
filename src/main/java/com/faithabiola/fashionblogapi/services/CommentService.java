package com.faithabiola.fashionblogapi.services;

import com.faithabiola.fashionblogapi.dto.CommentCreationDto;
import com.faithabiola.fashionblogapi.util.ApiResponse;
import jakarta.servlet.http.HttpSession;

public interface CommentService {

    ApiResponse createComment(CommentCreationDto commentCreationDto, Long postId, HttpSession httpSession);
}
