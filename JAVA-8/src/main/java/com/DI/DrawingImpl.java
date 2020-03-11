package com.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author vikas.bhardwaj3
 * 3/5/20206:33 PM2020
 */
@Component
public class DrawingImpl {
    @Autowired
    Drawing drawing;

 /*   public DrawingImpl(Drawing drawing) {
        this.drawing = drawing;
    }
*/
    public void drawShape() {
        drawing.shape();
    }
}
