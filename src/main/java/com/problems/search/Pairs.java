package com.problems.search;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Given  integers, count the number of pairs of integers whose difference is K.
 * Input Format

	The first line contains N and K. 
	The second line contains N numbers of the set. All the N numbers are unique.
	Output Format

	An integer that tells the number of pairs of integers whose difference is .

	Sample Input
	
	5 2  
	1 5 3 4 2  
	Sample Output
	
	3
	Explanation
	
	There are 3 pairs of integers in the set with a difference of 2.
 */

public class Pairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int res;
        
        String n = in.nextLine();
        String[] n_split = n.split(" ");
        
        int _a_size = Integer.parseInt(n_split[0]);
        int _k = Integer.parseInt(n_split[1]);
        
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        Arrays.sort(_a);
        res = pairs(_a,_k);
        System.out.println(res);
       
	}

	private static int pairs(int[] a, int k) {
		int count =0, i =0, j = 1;
		while(j<a.length){
		int	Difference=a[j]-a[i];
		if(Difference == k){
			count++;
			j++;
		}else if(Difference>k){
			i++;
		}else if(Difference<k){
			j++;
		}
		}
		return count;
	}

}
