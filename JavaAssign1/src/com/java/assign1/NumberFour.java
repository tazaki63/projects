package com.java.assign1;

import java.util.Scanner;

public class NumberFour {
	private static double areaToLength(double area) {
		double temp;
		
		temp=Math.sqrt(area);	
		
		return temp;
	}
	
	private static double calcPerimeter(double length) {
		return length*4;
	}
	
	public static void main(String[] args) {
		Scanner typed=new Scanner(System.in);
		
		System.out.println("please input an area for square: ");
		double a=typed.nextDouble();
		
		double length=areaToLength(a);
		
		typed.close();
		System.out.println("the perimeter is: "+ calcPerimeter(length));
		
	}
}
