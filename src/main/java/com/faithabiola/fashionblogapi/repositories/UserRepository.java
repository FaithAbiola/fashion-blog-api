package com.faithabiola.fashionblogapi.repositories;

import com.faithabiola.fashionblogapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    Optional<User> findUserByEmailAndPassword(String email, String password);
}
