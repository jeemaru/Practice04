package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		System.out.println("금액: ");
		int won = sc.nextInt();
		
		while (true) {
			for(int i=1; i<=1; i++)
			if(wonArray[0]<=won) {
				System.out.println("50000원: "+i+"개");
			}else if(wonArray[1]<=won) {
				System.out.println("10000원: "+i+"개");
			}else if(wonArray[2]<=won) {
				System.out.println("5000원: "+i+"개");
			}else if(wonArray[3]<=won) {
				System.out.println("1000원: "+i+"개");
			}else if(wonArray[4]<=won) {
				System.out.println("500원: "+i+"개");
			}else if(wonArray[5]<=won) {
				System.out.println("100원: "+i+"개");
			}else if(wonArray[6]<=won) {
				System.out.println("50원: "+i+"개");
			}else if(wonArray[7]<=won) {
				System.out.println("10원: "+i+"개");
			}continue;
			
			
		}
		
	}

}
