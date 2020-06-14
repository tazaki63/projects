package com.java.assign1;

import java.util.Scanner;

public class NumberSeven {

	private static double calculateTax(double income) {
		double temp =0;
		
		if(income<=240&&income>0) {
			temp=0.0;
		}else if(income<=480&&income>240) {
			temp=(0.15)*income;
		}else if(income>480) {
			temp=(0.28)*income;
		}else {
			System.out.println("Incorrect input");
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner typed=new Scanner(System.in);
		
		System.out.println("please input your income amount: ");
		double a=typed.nextDouble();

		typed.close();
		System.out.println("your tax payable is: $"+ calculateTax(a));
	}

}
