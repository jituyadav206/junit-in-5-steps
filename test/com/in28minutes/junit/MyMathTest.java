package com.in28minutes.junit;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @Before
    public void before(){
        System.out.println("Before");
    }

    @Test
    public void sum_with3numbers(){
        System.out.println("Test1");

        assertEquals(6,myMath.sum(new int[]{1,2,3}));

    }

    @After
    public void after(){
        System.out.println("After");
    }

    @BeforeClass
    public  static void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public static  void afterClass(){
        System.out.println("after calss");
    }

    @Test
    public void sum_with1numbers(){
        System.out.println("Test2");

        assertEquals(3,myMath.sum(new int[]{3}));

    }
}
