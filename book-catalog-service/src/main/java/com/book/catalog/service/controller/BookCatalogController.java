package com.book.catalog.service.controller;

import com.book.catalog.service.manager.BookCatalogManager;
import com.book.catalog.service.model.BookCatalogItem;
import com.book.catalog.service.model.BookInfo;
import com.book.catalog.service.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author vikas.bhardwaj3
 * 2/1/20209:14 PM2020
 */
@RestController
@RequestMapping("/bookCatalog")
public class BookCatalogController {

    @Autowired
    private BookCatalogManager bookCatalogManager;

    @PostMapping("/createBook")
    public Iterable<BookCatalogItem> createBookCatalog(@RequestBody List<BookCatalogItem> bookCatalogItemList) {
        return bookCatalogManager.createBookCatalogList(bookCatalogItemList);

    }

    @GetMapping("/getBook/{bookId}")
    public BookInfo getBook(@PathVariable  Long bookId){
        return bookCatalogManager.getBook(bookId);

    }
    @GetMapping("/getRating")
    public List<Rating> getRattingList(){
        return bookCatalogManager.getRattingList();

    }

}
