package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		char[] c = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);
		}System.out.println("");
		
		char[] w = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		w[4] = ',';
		w[7] = ',';
		w[9] = ',';
		
		for(int i=0; i<c.length; i++ ) {
			System.out.print(w[i]);
		}
	}

}
