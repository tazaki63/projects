package com.java.assign1;

import java.util.Scanner;

public class NumberThirteen {
	private static double calculateBalance(double p, double r, int t) {
		double interest= p*(r/100)*(t/12);
		double balance= p+interest;
		return balance;
	}
	
	public static void main(String[] args) {
		Scanner typed=new Scanner(System.in);
		
		System.out.println("please input your principal amount: ");
		double p=typed.nextDouble();
		
		System.out.println("please input your interest rate (if 15%, input 15): ");
		double r=typed.nextDouble();

		System.out.println("please input time in number of months: ");
		int t=typed.nextInt();

		
		typed.close();
		System.out.println("your balance after the time will be: $"+ calculateBalance(p,r,t));
	}
}
