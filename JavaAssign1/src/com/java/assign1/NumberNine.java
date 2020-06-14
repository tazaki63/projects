package com.java.assign1;

import java.util.Scanner;

public class NumberNine {

	private static double payBack(double amount) {
		double temp=0;
		
		if(amount<=500) {
			temp=0.0025*amount;
		}else if(amount>500&&amount<=1500) {
			temp=0.0025*500+0.005*(amount-500);
		}else if(amount>1500&&amount<=2500) {
			temp=0.0025*500+0.005*1000+0.0075*(amount-1500);
		}else if(amount>2500) {
			temp=0.0025*500+0.005*1000+0.0075*1000+0.01*(amount-2500);
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner typed=new Scanner(System.in);
		
		System.out.println("please input an amount: ");
		double a=typed.nextDouble();
		
		typed.close();
		System.out.println("the payback is: $"+ payBack(a));
		

	}
}
