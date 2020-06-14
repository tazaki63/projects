package com.java.assign1;

public class NumberTwo {

	private static int sumOfSquares(int x) {
		int temp=0;
		for(int i=1;i<=x;i++) {
			temp+= i*i;
		}
		return temp;
	}
	
	
	private static int squareOfSums(int y) {
		int temp=0;
		for(int i=1;i<=y;i++) {
			temp+=i;
		}
		temp*=temp;
		
		return temp;
	}
	
	private static int difference(int z) {
		int diff;
		
		diff=Math.abs(sumOfSquares(z) - squareOfSums(z));
		return diff;
	}
	public static void main(String[] args) {
		System.out.println(difference(5));////input here
	}
}
