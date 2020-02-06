package com.book.catalog.service.manager.impl;

import com.book.catalog.service.manager.BookCatalogManager;
import com.book.catalog.service.model.BookCatalogItem;
import com.book.catalog.service.model.BookInfo;
import com.book.catalog.service.model.Rating;
import com.book.catalog.service.model.UserRating;
import com.book.catalog.service.repository.BookCatalogRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vikas.bhardwaj3
 * 2/1/202010:00 PM2020
 */
@Component
public class BookCatalogManagerImpl implements BookCatalogManager {


    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private BookCatalogRepository bookCatalogRepository;
    @Autowired
    private WebClient.Builder webClientBuilder;

    @Override
    public Iterable<BookCatalogItem> createBookCatalogList(List<BookCatalogItem> bookCatalogItemList) {
        return bookCatalogRepository.createBookCatalog(bookCatalogItemList);

    }

    @HystrixCommand(fallbackMethod = "getFallbackCatalog")
    public BookInfo getBook(Long bookId) {
        String uri = "http://book-info-service/book/ ";
        String data = String.valueOf(bookId);
        //   HttpEntity httpEntity =getHttpEntity(data);
        return restTemplate.getForObject(uri + bookId, BookInfo.class);
        // return restTemplate.exchange(uri, HttpMethod.GET,httpEntity,BookInfo.class);
    }

    public BookInfo getFallbackCatalog(Long bookId) {
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookId((long) 111212);
        return bookInfo;
    }

    @Override
    public List<Rating> getRattingList() {
        Rating rating = webClientBuilder.build()
                .get()
                .uri("movie-info-service")
                .retrieve()
                .bodyToMono(Rating.class)
                .block();
        List<Rating> ratingList = new ArrayList<>();
        ratingList.add(rating);
        return ratingList;
    }

    private HttpEntity<String> getHttpEntity(String data) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", MediaType.APPLICATION_JSON.toString());
        httpHeaders.add("Accept", MediaType.APPLICATION_JSON.toString());
        httpHeaders.add("Accept-Language", "en-US,en;q=0.8,es;q=0.6,fr-fr;q=0.4");
        HttpEntity<String> request = new HttpEntity<String>(httpHeaders);
        request = new HttpEntity<String>(data, httpHeaders);
        return request;


    }

   public  List<BookCatalogItem>getCatalog(String userId){
       UserRating userRating = restTemplate.getForObject("http://book-rating-service/")


    }
}
