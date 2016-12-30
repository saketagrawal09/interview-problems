package com.problems.warmup;

import java.util.Scanner;
/*
 * Consider a staircase of size N:4

   #
  ##
 ###
####

Observe that its base and height are both equal to N, and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size N.

Input Format

A single integer, , denoting the size of the staircase.

Output Format

Print a staircase of size  using # symbols and spaces.

Note: The last line must have  spaces in it.

Sample Input

6 
Sample Output

     #
    ##
   ###
  ####
 #####
######
 */

public class Staircase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i+j>n-2){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
