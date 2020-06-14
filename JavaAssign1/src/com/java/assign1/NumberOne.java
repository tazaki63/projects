package com.java.assign1;

public class NumberOne {
	
	private static int maxNumber(int x, int y, int z) {
		int temp;
		
		
		if(x>y&&x>z) {
			temp=x;}
		else if(y>x&&y>z) {temp=y;}
		else {temp=z;}
		
		return temp;
	}
	
	public static void main(String[] args) {
		System.out.println(maxNumber(31,22222,1111));////input number here
	}
}
