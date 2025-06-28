package com.book.spring_book.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class UpdateArticleRequest {
    private String title;
    private String content;
}
