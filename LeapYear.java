package com.day.one;

import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
	int year;
	System.out.println("Enter any year");
	Scanner sc = new Scanner(System.in);
	year = sc.nextInt();
	
	if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				System.out.println("Its a leap year");
			} else {
				System.out.println("Its not a leap year");
			}
}
}
