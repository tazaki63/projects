package com.java.assign1;

import java.util.Scanner;

public class NumberTen {

	final static int ticketPrice=5;
	private static double calculateTotalProfit(int numberAttendees) {
		double temp=numberAttendees*ticketPrice-(20+(0.5*numberAttendees));
		
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner typed=new Scanner(System.in);
		
		System.out.println("please input the number of attendees : ");
		int a=typed.nextInt();
		
		typed.close();
		System.out.println("the total profit is: $"+ calculateTotalProfit(a));
	}
}
