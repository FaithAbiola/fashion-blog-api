package com.faithabiola.fashionblogapi.services;

import com.faithabiola.fashionblogapi.util.ApiResponse;
import jakarta.servlet.http.HttpSession;

public interface PostLikeService {

    ApiResponse likePost(Long id, HttpSession httpSession);
}
