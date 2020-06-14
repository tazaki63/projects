package com.java.assign1;

import java.util.Scanner;

public class NumberEight {

	final static double taxRate= 0.15;
	final static double wage=12;
	
	private static double calculateNetPay(int hours) {
		double grossPay=hours*wage;
		
		double netPay=grossPay-(grossPay*taxRate);
		
		return netPay;		
	}
	
	public static void main(String[] args) {
Scanner typed=new Scanner(System.in);
		
		System.out.println("please input your hours worked: ");
		int a=typed.nextInt();

		typed.close();
		System.out.println("your net pay is: $"+ calculateNetPay(a));

	}
}
