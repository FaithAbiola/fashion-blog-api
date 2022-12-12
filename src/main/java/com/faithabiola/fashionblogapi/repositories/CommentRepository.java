package com.faithabiola.fashionblogapi.repositories;

import com.faithabiola.fashionblogapi.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
