//package com.book.spring_book.controller;
//
//import com.book.spring_book.dto.AddArticleRequest;
//import com.book.spring_book.repository.BlogRepository;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//class BlogControllerTest {
//    @Autowired
//    protected MockMvc mvc;
//
//    @Autowired
//    protected ObjectMapper objectMapper;
//
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//    @Autowired
//    BlogRepository blogRepository;
//
//    @BeforeEach
//    public void mockMvcSetup(){
//        this.mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//        blogRepository.deleteAll();
//    }
//
//    @DisplayName("addArticle: 블로그 글 추가에 성공한다")
//    @Test
//    public void addArticle() throws Exception{
//        //given
//        final String url = "/api/articles";
//        final String title = "title";
//        final String content = "content";
//        final AddArticleRequest request = new AddArticleRequest(title, content);
//
//        final String requestBody = objectMapper.writeValueAsString(request);
//
//        //when
//        ResultActions result = mvc.perform(post(url)
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .content(requestBody));
//
//        //then
//        result.andExpect(status().isCreated());
//
//        List<Article>
//    }
//}