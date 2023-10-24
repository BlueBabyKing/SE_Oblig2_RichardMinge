package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapTests {


    @Test
    void testIfYear2000IsLeapYearEqualsTrue(){
        var CalenderTester = new CalenderMemes();
        assertTrue(CalenderTester.isLeapYear(2000)); //T
    }
    @Test
    void testIfYear2004IsLeapYearEqualsTrue(){
        var ClenderTester = new CalenderMemes();
        assertTrue(ClenderTester.isLeapYear(2004)); //T
    }
    @Test
    void testIfYear2008IsLeapYearEqualsTrue(){
        var CalenderTester = new CalenderMemes();
        assertTrue(CalenderTester.isLeapYear(2008)); //T
    }
    @Test
    void testIfYear1900UIsLeapYearEqualsFalse(){
        var C = new CalenderMemes();
        assertFalse(C.isLeapYear(1900)); //F
    }
    @Test
    void testIfYear2100IsLeapYearEqualsFalse(){
        var dicks = new CalenderMemes();
        assertFalse(dicks.isLeapYear(2100)); //F
    }
}

