package com.faithabiola.fashionblogapi.repositories;

import com.faithabiola.fashionblogapi.entities.CommentLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentLikeRepository extends JpaRepository<CommentLike, Long> {
}
