package com.book.spring_book.service;


import com.book.spring_book.domain.Article;
import com.book.spring_book.dto.AddArticleRequest;
import com.book.spring_book.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor //final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll(){
        return blogRepository.findAll();
    }

    public void delete(Long id){
        blogRepository.deleteById(id);
    }
}
