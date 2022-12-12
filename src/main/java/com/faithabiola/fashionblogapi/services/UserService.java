package com.faithabiola.fashionblogapi.services;

import com.faithabiola.fashionblogapi.dto.UserResponseDto;
import com.faithabiola.fashionblogapi.dto.UserSignUpDto;
import com.faithabiola.fashionblogapi.util.ApiResponse;
import jakarta.servlet.http.HttpSession;

import java.util.List;

public interface UserService {
    ApiResponse<UserResponseDto> signUp(UserSignUpDto signUpDto);

    ApiResponse<UserResponseDto> login(UserSignUpDto signUpDto, HttpSession httpSession);

    ApiResponse<String> logout(HttpSession session);

    ApiResponse<List<UserResponseDto>> getAllUsers(HttpSession httpSession);
}
