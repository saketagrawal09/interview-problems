package com.problems.search;

import java.util.Scanner;

public class SherlockAndArray {
	
	/*
	 Watson gives Sherlock an array A of length N. Then he asks him to determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero. 
Formally, find an i , such that, A1+A2...Ai-1 = Ai+1 + ... An.

Output Format

For each test case print YES if there exists an element in the array, such that the sum of the elements on its left is equal to the sum of the elements on its right; otherwise print NO.

Sample Input

2
3
1 2 3
4
1 2 3 3
Sample Output

NO
YES 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		
		for (int i = 0; i < testCase; i++) {
			int arrayLength = scanner.nextInt();
			int []array = new int[arrayLength];
			int sum=0;	Boolean result = false;
			for (int j = 0; j < array.length; j++) {
					array[j]= scanner.nextInt();
					sum = sum + array[j];
				}	
			
			if (array.length ==1) {
				result = true;
				
			}else{
				int val = array[0];
				for (int j = 1; j < array.length; j++) {
					if (sum-val==val+array[j]) {
						result = true;
						break;
					}
					val = val + array[j];
				}
			}
			if(result){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}	
			}
			
	}

}
