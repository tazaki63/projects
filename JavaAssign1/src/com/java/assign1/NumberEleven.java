package com.java.assign1;

import java.util.Scanner;

public class NumberEleven {
	final static int daysInMonths[]= {31,28,31,30,31,30,31,31,30,31,30,31};

	public static int getTotalDays(int d, int m, int y) {
		int leapNumber=(y-1900)/4;
		int totalDays=((y-1900)*365)+leapNumber;
	
		int leapYears[]=new int[50];
		
		int counter=0;
		for(int i=1900;i<=2100;i+=4) {
			leapYears[counter]=i;
		}
		
		boolean isLeapYear=false;
		
		for(int x:leapYears) {
			if(x==y){
				isLeapYear=true;
				break;
			}
		}
		if(isLeapYear&&m<=2) {
			totalDays--;
		}
		for(int i=0;i<m;i++) {
			totalDays+=daysInMonths[i];
		}
		
		totalDays+=d;
		
		return totalDays;	
	}
	private static String getDay(int d, int m, int y) {
		int totalDays=getTotalDays(d, m, y);
		
		switch(totalDays%7) {
		case 0: return "Sunday";
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednesday";
		case 4: return "Thursday";
		case 5: return "Friday";
		case 6: return "Saturday";
		default:return "Wrong Input";
		}
		
	}
	
	public static void main(String[] args) {
		Scanner typed=new Scanner(System.in);
		
		System.out.println("please input Date: ");
		int a=typed.nextInt();

		System.out.println("please input month: ");
		int b=typed.nextInt();


		System.out.println("please input year: ");
		int c=typed.nextInt();
		
		typed.close();
		System.out.println("the day is"+ getDay(a, b, c));
	}

}
