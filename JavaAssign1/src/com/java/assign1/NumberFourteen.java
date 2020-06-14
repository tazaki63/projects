package com.java.assign1;
import java.util.*;
public class NumberFourteen {

	private static int calculateLoan(int age, String gen, String prof, int persA) {
		int loanAmount;
		
		if(age>=16&&age<=25) {
			if(persA<25000) {
				System.out.println("you are not eligible for loan");
				loanAmount=0;
			}else {
				if(prof.equals("SE")) {
					loanAmount=10000;
				}else {
					loanAmount=15000;
				}
			}
						
		}else if(age>=26&&age<=40) {
			
			if(persA<40000) {
				System.out.println("you are not eligible for loan");
				loanAmount=0;
			}else {
				if(gen.equals("M")) {
					loanAmount=25000;
				}else {
					loanAmount=30000;
				}
			}
		
			
			
			
			
		}else if(age>=41&&age<=60) {
			
			if(persA<50000) {
				System.out.println("you are not eligible for loan");
				loanAmount=0;
			}else {
				loanAmount=40000;
			}
		
			
			
		}else {
			if(persA<25000) {
				System.out.println("you are not eligible for loan");
				loanAmount=0;
			}else {
				if(prof.equals("SE")) {
					loanAmount=35000-age*100;
				}else {
					loanAmount=25000-age*100;
				}
			}
		
			
		}
		
		
		
		return loanAmount;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		String gender;
		String jobStatus;
		int personalAssets;
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		System.out.println("Enter your gender (M/F): ");
		gender=sc.next();
		System.out.println("Enter your job status(SE/P/R:");
		jobStatus=sc.next();
		System.out.println("Enter your personal assests value:");
		personalAssets=sc.nextInt();
	
		System.out.println("here are your output: $"+ calculateLoan(age, gender, jobStatus, personalAssets));
	
	}
}
