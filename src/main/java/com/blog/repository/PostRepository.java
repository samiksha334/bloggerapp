package com.blog.repository;

import com.blog.entity.Comment;
import com.blog.entity.Post;
import com.blog.payload.CommentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    //List<Comment> findByPostId( long PostId);
}
