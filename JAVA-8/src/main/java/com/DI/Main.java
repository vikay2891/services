package com.DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

import java.util.Map;

/**
 * @author vikas.bhardwaj3
 * 3/5/20205:27 PM2020
 */
@SpringBootApplication
public class Main extends SpringBootServletInitializer {


    public static void main(String[] args) {
        //   Main main = new Main();
        ApplicationContext applicationContext = SpringApplication.run(Main.class, args);
        DrawingImpl drawingImpl =applicationContext.getBean(DrawingImpl.class);
        drawingImpl.drawShape();

    }
}
