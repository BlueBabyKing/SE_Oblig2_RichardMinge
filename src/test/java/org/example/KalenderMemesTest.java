package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalenderMemesTest {

    @Test
    void testY2000IsTrue(){
        var CalenderTester = new CalenderMemes();
        assertTrue(CalenderTester.isLeapYear(2000)); //T
    }
    @Test
    void testY2004IsTrue(){
        var ClenderTester = new CalenderMemes();
        assertTrue(ClenderTester.isLeapYear(2004)); //T
    }
    @Test
    void testY2008IsTrue(){
        var CalenderTester = new CalenderMemes();
        assertTrue(CalenderTester.isLeapYear(2008)); //T
    }
    @Test
    void testY1900IsFalse(){
        var C = new CalenderMemes();
        assertFalse(C.isLeapYear(1900)); //F
    }
    @Test
    void testY2100IsFalse(){
        var dicks = new CalenderMemes();
        assertFalse(dicks.isLeapYear(2100)); //F
    }
}