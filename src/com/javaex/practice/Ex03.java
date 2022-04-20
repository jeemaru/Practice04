package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = {3, 6, 9};
		
		int[] intB;
		intB = intA;
		intA[0] = 0;
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}// intB 값에 따로 공간을 설정하지않고 공유를 하므로 바뀐값이 그대로 적용되서 나옴

	}

}
