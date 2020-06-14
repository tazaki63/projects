package com.java.assign1;

import java.util.Scanner;

public class NumberTwelve {

	final static double g=9.8;
	private static double calculateHeight(int t) {
		double v=g*t, height=0.5*v*t;
		return height;
	}
	public static void main(String[] args) {
		Scanner typed=new Scanner(System.in);
		
		System.out.println("please input time(sec) : ");
		int a=typed.nextInt();
		
		typed.close();
		System.out.println("the total profit is: $"+ calculateHeight(a));
	
	}
}
