package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapTests {


    @Test
    void testY2000IsLeapYearIsTrue(){
        var CalenderTester = new CalenderMemes();
        assertTrue(CalenderTester.isLeapYear(2000)); //T
    }
    @Test
    void testY2004IsLeapYearIsTrue(){
        var ClenderTester = new CalenderMemes();
        assertTrue(ClenderTester.isLeapYear(2004)); //T
    }
    @Test
    void testY2008IsLeapYearIsTrue(){
        var CalenderTester = new CalenderMemes();
        assertTrue(CalenderTester.isLeapYear(2008)); //T
    }
    @Test
    void testY1900UIsLeapYearIsFalse(){
        var C = new CalenderMemes();
        assertFalse(C.isLeapYear(1900)); //F
    }
    @Test
    void testY2100IsLeapYearIsFalse(){
        var dicks = new CalenderMemes();
        assertFalse(dicks.isLeapYear(2100)); //F
    }
}

