package com.problems.search;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MissingNumbers {
	/*
	 Numeros, the Artist, had two lists A and B, such that B was a permutation of A. Numeros was very proud of these lists. Unfortunately, while transporting them from one exhibition to another, some numbers were left out of A. Can you find the missing numbers?
	 
	 If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is the same. If that is not the case, then it is also a missing number.
	You have to print all the missing numbers in ascending order.
	Print each missing number once, even if it is missing multiple times.
	The difference between maximum and minimum number in B is less than or equal to 100.
	
	Sample Input

10
203 204 205 206 207 208 203 204 205 206
13
203 204 204 205 206 207 205 208 203 206 205 206 204
Sample Output

204 205 206
	 * */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A_List= scanner.nextInt();
		int []A = new int[A_List];
		
		for(int i=0;i<A.length;i++){
			A[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(A));
		int B_List= scanner.nextInt();
		int []B = new int[B_List];
		for(int i=0;i<B.length;i++){
			B[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(B));
		int min =B[0] ,max=0;
		for (int i = 0; i < B.length; i++) {
			if(B[i]<=min)
				min = B[i];
			if(B[i]>=max)
				max = B[i];
		}
		System.out.println("MInimum"+ min + "MIximum"+max);
		
		while(min<=max){
			int countA=0,countB=0;
			for (int i = 0; i < A.length; i++) {
				if(A[i]==min){
					countA++;
				}
			}
			for (int i = 0; i < B.length; i++) {
				if(B[i]==min){
					countB++;
				}
			}
			if(countA != countB){
				System.out.println(min);
			}
			min++;
		}
		
	

	}

}
