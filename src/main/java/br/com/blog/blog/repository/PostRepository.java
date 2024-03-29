package br.com.blog.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.blog.blog.model.PostModel;

@Repository
public interface PostRepository extends JpaRepository<PostModel, Long> {
    
}
