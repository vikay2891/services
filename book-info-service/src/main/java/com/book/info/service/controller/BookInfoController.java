package com.book.info.service.controller;

import com.book.info.service.manager.BookInfoManager;
import com.book.info.service.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.Optional;

/**
 * @author vikas.bhardwaj3
 * 2/2/202011:31 PM2020
 */
@RestController
@EnableSwagger2
@RequestMapping("/book")
public class BookInfoController {

    @Autowired
    private BookInfoManager bookInfoManager;


    @PostMapping("/createBooks")
    public Iterable<BookInfo> createBooks(@RequestBody List<BookInfo> bookInfoList){

        return bookInfoManager.createBooks(bookInfoList);

    }

    @GetMapping("/{movieId}")
    public Optional<BookInfo> getBookInfo(@PathVariable Long movieId){
        return bookInfoManager.getBook(movieId);

    }



}
