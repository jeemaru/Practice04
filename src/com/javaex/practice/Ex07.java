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
		
		System.out.print("금액: ");
		int won = sc.nextInt();

			for(int i=0; i<wonArray.length; i++) {
				if (won/wonArray[i]>=0) {
					System.out.println(wonArray[i]+"원: "+won/wonArray[i]+"개");
					//해당값을 나누고 나머지값은 추가로 나눠서 갯수를 따짐
					won = won%wonArray[i]; // 총 9번 반복해서 마지막 1의자리까지 전부 나눔
				}
			}
		sc.close();	
			
	}
}
