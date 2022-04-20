package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double no = 0;
		int[] num = new int[5];
		
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		num[3] = sc.nextInt();
		num[4] = sc.nextInt();
		
		for(int i=0; i<1; i++) {
			no = (num[0]+num[1]+num[2]+num[3]+num[4])/5;
		}System.out.println(no);
		
		
		
		sc.close();
	}

}
