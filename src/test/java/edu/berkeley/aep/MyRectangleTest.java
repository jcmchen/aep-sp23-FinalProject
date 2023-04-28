package edu.berkeley.aep;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    @Test
    public void rectangleOneWidthFIVEHeightSIXShouldContainPointONEONE(){
        MyRectangle r1 = new MyRectangle(0, 0, 5, 6);
        assertTrue(r1.contains(1,1));
    }
    @Test
    public void rectangleOneWidthFIVEHeightSIXShouldContainItself(){
        MyRectangle r1 = new MyRectangle(0, 0, 5, 6);
        assertTrue(r1.contains(r1));
    }
    @Test
    public void rectangleOneWidthFIVEHeightSIXShouldContainRectangleTwoWidthFOURHeightFIVE(){
        MyRectangle r1 = new MyRectangle(0, 0, 5, 6);
        MyRectangle r2 = new MyRectangle(0, 0, 4, 5);
        assertTrue(r1.contains(r2));
    }
    @Test
    public void rectangleOneWidthFIVEHeightSIXShouldOverlapItself(){
        MyRectangle r1 = new MyRectangle(0, 0, 5, 6);
        assertTrue(r1.overlaps(r1));
    }
    @Test
    public void rectangleOneWidthFIVEHeightSIXShouldOverlapRectangleThreeWidthEIGHTHeightFOUR(){
        MyRectangle r1 = new MyRectangle(0, 0, 5, 6);
        MyRectangle r3 = new MyRectangle(0, 0, 8, 4);
        assertTrue(r1.overlaps(r3));
    }

    @Test
    public void rectangleOneWidthFIVEHeightSIXShouldNotContainPointTHREEONE(){
        MyRectangle r1 = new MyRectangle(0, 0, 5, 6);
        assertFalse(r1.contains(3,1));
    }

    @Test
    public void rectangleTwoWidthFOURHeightFIVEShouldNotContainRectangleOneWidthFIVEHeightSIX(){
        MyRectangle r1 = new MyRectangle(0, 0, 5, 6);
        MyRectangle r2 = new MyRectangle(0, 0, 4, 5);
        assertFalse(r2.contains(r1));
    }

    @Test
    public void rectangleOneWidthFIVEHeightSIXShouldNotOverlapRectangleTwoWidthFOURHeightFIVE(){
        MyRectangle r1 = new MyRectangle(0, 0, 5, 6);
        MyRectangle r2 = new MyRectangle(0, 0, 4, 5);
        assertTrue(r1.overlaps(r2));
    }


}
