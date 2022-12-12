package com.faithabiola.fashionblogapi.dto;

import com.faithabiola.fashionblogapi.entities.Post;
import com.faithabiola.fashionblogapi.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostLikeCreationDto {

    private Date createdAt;
    private User user;
    private Post post;

}