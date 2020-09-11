package com.company;

public class Main {

    public static void main(String[] args) {
	// write your c8ode here
        isLeapYear(1846);
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999) {
            if(year % 4 != 0){
                System.out.println("false");
                return false;
            }
            else if(year % 4 == 0){//checks to see if number is evenly divisible by 4, if trure continue
                if(year % 100 == 0){// checks if number is evenly divisible by 100, if true continue
                    if(year % 400 ==0){// checks if number is evenly divisible by 400 if true continue
                        System.out.println("true");
                        return true;
                    }
                    System.out.println("false");
                    return false;// if number is divisibly by 4 but not 100 its not a leap year, returns false.
                }
                System.out.println("true");
                return true;// if a number is divible by 4 but not by 100 the year is a leap year, returns true.
            }

        }
        System.out.println("false");
        return false;// if number is not divisible by 4 returns false.
    }
}
