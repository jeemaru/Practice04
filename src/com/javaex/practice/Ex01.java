package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		intArray[3] = 15;
		intArray[4] = 17;
		
		int result = 0; 
		
		for(int i=0; i<intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result); //부호에 같다는 표식과, 값을 5까지웠는데 3까지밖에 표기가 안되서 임의값을 줌
	}

}
