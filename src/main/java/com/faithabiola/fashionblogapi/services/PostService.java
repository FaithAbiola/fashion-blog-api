package com.faithabiola.fashionblogapi.services;

import com.faithabiola.fashionblogapi.dto.PostCreationDto;
import com.faithabiola.fashionblogapi.dto.PostResponseDto;
import com.faithabiola.fashionblogapi.util.ApiResponse;
import jakarta.servlet.http.HttpSession;

public interface PostService {

    ApiResponse<PostResponseDto> createPost(PostCreationDto postCreationDto, HttpSession httpSession);
}
