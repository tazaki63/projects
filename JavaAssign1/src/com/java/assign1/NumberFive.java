package com.java.assign1;

import java.util.Scanner;

public class NumberFive {

	private static double interestEarned(double deposit) {
		double interest=0;
		if(deposit<0) {
			System.out.println("wrong input");
		}else if(deposit>1000&&deposit<=5000) {
			interest=0.045*deposit;
		}else if(deposit>5000) {
			interest=0.05*deposit;
		}else if(deposit<=1000) {
			interest=0.04*deposit;
		}
		return interest;
	}
	
	public static void main(String[] args) {
		Scanner typed=new Scanner(System.in);
		
		System.out.println("please input a deposit amount: ");
		double a=typed.nextDouble();
		
		typed.close();
		System.out.println("the interest earned in a year for the deposit is: $"+ interestEarned(a));
		
	}
}
