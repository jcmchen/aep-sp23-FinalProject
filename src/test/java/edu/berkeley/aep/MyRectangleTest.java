package edu.berkeley.aep;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyRectangleTest {
    @Test
    public void areaOfRectangleOneWidthFIVEHeightSIXShouldBeTHIRTY(){
        MyRectangle r1 = new MyRectangle(0, 0, 5, 6);
        assertEquals(30, r1.getArea());
    }
    @Test
    public void perimeterOfRectangleOneWidthFIVEHeightSIXShouldBeTWENTYTWO(){
        MyRectangle r1 = new MyRectangle(0, 0, 5, 6);
        assertEquals(22, r1.getPerimeter());
    }




}
