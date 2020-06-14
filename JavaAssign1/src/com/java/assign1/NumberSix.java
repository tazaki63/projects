package com.java.assign1;

import java.util.Scanner;

public class NumberSix {

	private static double calculateCylinderVolume(double radius, double height) {
		double temp=Math.PI*Math.pow(radius, 2)*height;
		
		return temp;	
	}
	
	public static void main(String[] args) {
		Scanner typed=new Scanner(System.in);
		
		System.out.println("please input radius: ");
		double a=typed.nextDouble();
		

		System.out.println("please input height: ");
		double b=typed.nextDouble();
		
		
		typed.close();
		System.out.println("the area of cylinder is: "+ calculateCylinderVolume(a, b));
	}
}
