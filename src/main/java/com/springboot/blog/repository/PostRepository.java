package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

// not necessary to @Repository
public interface PostRepository extends JpaRepository<Post,Long> {
}
