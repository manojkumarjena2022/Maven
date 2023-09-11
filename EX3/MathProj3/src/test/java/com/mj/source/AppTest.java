package com.mj.source;

import junit.framework.*;

public class AppTest extends TestCase
{
    public void testSumWithPositives()
    {
        Arithmetic ar = null;
        //create object
        ar = new Arithmetic();
        int actual = ar.add(20, 40);
        int expected = 60;
        assertEquals(expected, actual);
    }
    public void testSumWithNegatives()
    {
        Arithmetic ar = null;
        //create object
        ar = new Arithmetic();
        int actual = ar.add(-20, -40);
        int expected = -60;
        assertEquals(expected, actual);
    }
    public void testSumWithMixed()
    {
        Arithmetic ar = null;
        //create object
        ar = new Arithmetic();
        int actual = ar.add(-20, 40);
        int expected = 20;
        assertEquals(expected, actual);
    }
    public void testSumWithZeros()
    {
        Arithmetic ar = null;
        //create object
        ar = new Arithmetic();
        int actual = ar.add(0, 0);
        int expected = 0;
        assertEquals(expected,actual);
    }
    public void testApp()
    {
        assertTrue( true );
    }
}
