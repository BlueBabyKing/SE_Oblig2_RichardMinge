package org.example;

public class CalenderMemes {


    public boolean isLeapYear(int y){
        boolean x = false;

        if (y % 100 != 0 || y % 400 ==0)
            if(y % 4 ==0)
                x = true;
        return x;
    }
}




//