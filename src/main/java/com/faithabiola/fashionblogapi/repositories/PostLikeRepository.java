package com.faithabiola.fashionblogapi.repositories;

import com.faithabiola.fashionblogapi.entities.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostLikeRepository extends JpaRepository<PostLike, Long> {
}
