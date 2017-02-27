package ru.src.main.java;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

/**
 * Created by User on 27.02.2017.
 */
public class Squaretest {
    @Test
    public void testarea(){
        Point s = new Point();
        Assert.assertEquals(s.distance(1,2,4,6),  6.0);
    }
}
