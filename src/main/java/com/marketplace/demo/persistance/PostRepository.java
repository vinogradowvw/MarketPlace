package com.marketplace.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketplace.demo.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}