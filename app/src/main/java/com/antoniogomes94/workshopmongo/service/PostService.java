package com.antoniogomes94.workshopmongo.service;

import com.antoniogomes94.workshopmongo.domain.Post;
import com.antoniogomes94.workshopmongo.exception.ObjectNotFoundException;
import com.antoniogomes94.workshopmongo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
