package com.problems.warmup;

import java.util.Scanner;

/*
Given a square matrix of size N*N , calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is: 
11
      5
            -12

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
            4
      5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15 */

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[][] = new int[n][n];
	        int sum1=0,sum2=0;
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	                a[a_i][a_j] = in.nextInt();
	                if(a_i ==a_j){
	                    sum1 = sum1 + a[a_i][a_j];
	                }
	                if(a_i + a_j ==n -1){
	                    sum2= sum2 + a[a_i][a_j];
	                }
	            }
	        }
	        if(sum1>sum2){
	            System.out.print(sum1-sum2);
	        }else{
	            System.out.print(sum2-sum1);
	        }

	}

}
