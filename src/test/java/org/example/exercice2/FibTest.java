package org.example.exercice2;

import org.example.exercice1.GradingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FibTest {

    private Fib fib;

    @Test
    void getFibSeriesTest1(){
        //Arrange
        fib = new Fib(1);
        List res = fib.getFibSeries();
        Assertions.assertEquals(Arrays.asList(0), res);
    }

    @Test
    void getFibSeriesTest2(){
        //Arrange
        fib = new Fib(6);
        List res = fib.getFibSeries();
        Assertions.assertTrue(res.contains(3));
    }

    @Test
    void getFibSeriesTest3(){
        //Arrange
        fib = new Fib(6);
        List res = fib.getFibSeries();
        Assertions.assertTrue(res.contains(3));
    }

    @Test
    void getFibSeriesTest4(){
        //Arrange
        fib = new Fib(6);
        List res = fib.getFibSeries();
        Assertions.assertEquals(6,res.size());
    }

    @Test
    void getFibSeriesTest5(){
        //Arrange
        fib = new Fib(6);
        List res = fib.getFibSeries();
        Assertions.assertFalse(res.contains(4));
    }

    @Test
    void getFibSeriesTest6(){
        //Arrange
        fib = new Fib(6);
        List res = fib.getFibSeries();
        Assertions.assertTrue(res.containsAll(Arrays.asList(1,1,0,2,3,5)));
    }
    @Test
    void getFibSeriesTest7(){
        //Arrange
        fib = new Fib(6);
        List res = fib.getFibSeries();
        Assertions.assertEquals(Arrays.asList(0,1,1,2,3,5), res);
    }
}
