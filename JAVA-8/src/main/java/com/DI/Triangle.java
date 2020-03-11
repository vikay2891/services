package com.DI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author vikas.bhardwaj3
 * 3/5/20205:26 PM2020
 */
@Component
@Primary
public class Triangle  implements Drawing{
    @Override
    public void shape() {
        System.out.println("trangle");
    }
}
