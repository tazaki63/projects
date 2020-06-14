package com.java.assign1;

import java.util.Scanner;

public class NumberThree {
	
	private static boolean isVowel(String a) {
		boolean temp;
		
		if(a.contentEquals("a")||a.contentEquals("e")||a.contentEquals("i")
				||a.contentEquals("o")||a.contentEquals("u")) { temp=true;}
		else { temp=false;	}
				
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner typed=new Scanner(System.in);
		
		System.out.println("please input an alphabet: ");
		String a=typed.next();

		typed.close();
		System.out.println("is the alphabet a vowel?: "+ isVowel(a));
	}	

}
