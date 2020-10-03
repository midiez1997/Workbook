package com.pvt;

public class Main {

    public static void main(String[] args) {
	    int i = 0;
	    int factorial = 1;
	    while (i <= 10) {
	    	if (i == 0) {
            factorial = 1;
        } else {
	        factorial *= i;
	    }
	    i++;
	    System.out.println(factorial);
        }
	    // write your code here
    }
}
