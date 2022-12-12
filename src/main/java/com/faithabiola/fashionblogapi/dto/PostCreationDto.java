package com.faithabiola.fashionblogapi.dto;

import com.faithabiola.fashionblogapi.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class PostCreationDto {
    private String post;
    private Date createdAt;
    private String category;
    private User user;
}
