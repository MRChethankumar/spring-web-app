package com.example.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webapp.models.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
