package com.book.catalog.service.controller;

import com.book.catalog.service.manager.BookCatalogManager;
import com.book.catalog.service.model.*;
import com.book.catalog.service.security.MyUserDeatilsService;
import com.book.catalog.service.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
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

    @Autowired
    private  AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDeatilsService myUserDeatilsService;
    @Autowired
    private JwtUtil jwtUtil;

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
    @RequestMapping("/hello")
    public String hi(){
        return "hi welcome";
    }


    @PostMapping("/authenticate")
     public  ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws  Exception{

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUserName(),authenticationRequest.getPassword()));
        } catch (BadCredentialsException e) {
            throw new Exception("Invalid Username or Password");
        }
        final UserDetails userDetails=myUserDeatilsService.loadUserByUsername(authenticationRequest.getUserName());

        final String jwt =jwtUtil.generateToken(userDetails);
        return  ResponseEntity.ok(new AuthentocationResponse(jwt));
    }
}
