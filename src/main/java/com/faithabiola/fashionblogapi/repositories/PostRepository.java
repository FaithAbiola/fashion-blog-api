package com.faithabiola.fashionblogapi.repositories;

import com.faithabiola.fashionblogapi.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
