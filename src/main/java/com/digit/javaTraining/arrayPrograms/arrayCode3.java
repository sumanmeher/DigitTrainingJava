package com.digit.javaTraining.arrayPrograms;

import java.util.Scanner;

public class arrayCode3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of the classes: ");
		int cls = sc.nextInt();
		System.out.println("Enter the count of students in each classes: ");
		int stu = sc.nextInt();
		
		String arr[][]=new String[cls][stu];
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class - "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Enter the name of Student no: "+(j+1));
				arr[i][j]=sc.next();
			}
		}
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class - "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("The name of Student no: "+(j+1)+" is: "+arr[i][j]);
				
			}
		}
		
	}

}
