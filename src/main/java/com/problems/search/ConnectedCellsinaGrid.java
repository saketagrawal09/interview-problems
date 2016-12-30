package com.problems.search;
/*
Consider a matrix with n rows and m columns, where each cell contains either a 0 or a 1 and any cell containing a is called a filled cell. Two cells are said to be connected if they are adjacent to each other horizontally, vertically, or 
diagonally; in other words,[i][j] cell  is connected to cells [i-1][j-1],[i-1][j],[i-1][j+1],[i][j-1],[i][j+1],[i+1][y-1],[i+1][y],[i+1][j+1] and , provided that the location exists in the matrix for that [i][j].
 	
If one or more filled cells are also connected, they form a region. Note that each cell in a region is connected to at least one other cell in the region but is not necessarily directly connected to all the other cells in the region.

Task 
Given an  matrix, find and print the number of cells in the largest region in the matrix. Note that there may be more than one region in the matrix.

Input Format
The first line contains an integer,n , denoting the number of rows in the matrix. 
The second line contains an integer,m , denoting the number of columns in the matrix. 
Each line i of the n subsequent lines contains m space-separated integers describing the respective values filling each row in the matrix.

Output Format
Print the number of cells in the largest region in the given matrix.

Sample Input
4
4
1 1 0 0
0 1 1 0
0 0 1 0
1 0 0 0

Sample Output
5

Explanation
The diagram below depicts two regions of the matrix; for each region, the component cells forming the region are marked with an X:
X X 0 0     1 1 0 0
0 X X 0     0 1 1 0
0 0 X 0     0 0 1 0
1 0 0 0     X 0 0 0
The first region has five cells and the second region has one cell. Because we want to print the number of cells in the largest region of the matrix, we print 5.
 */

import java.util.Scanner;

public class ConnectedCellsinaGrid {
	public static int array[][];
	public static boolean[][] cellStatus ;
	static int count=0,MAX=0;
	static int n,m;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 n =scanner.nextInt();
		 m = scanner.nextInt();
		array= new int[n][m];
		cellStatus = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array[i][j]=scanner.nextInt();	
			}
		}
	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(array[i][j]==1 && !cellStatus[i][j]){
					count=1;
					cellStatus[i][j]=true;
					move(i,j);
				}
			}
			
		}
		System.out.println(MAX);
	}

	private static void move(int i, int j) {
		if(count>MAX)
			MAX=count;
		if(i-1>=0 && j-1>=0 && array[i-1][j-1]==1 && !cellStatus[i-1][j-1] ){
			count++;
			cellStatus[i-1][j-1]=true;
			move(i-1,j-1);
		}
		if(i-1>=0 && !cellStatus[i-1][j] && array[i-1][j]==1){
			count++;
			cellStatus[i-1][j]=true;
			move(i-1,j);
		}
		if(i-1>=0 && j+1<m && !cellStatus[i-1][j+1] && array[i-1][j+1]==1){
			count++;
			cellStatus[i-1][j+1]=true;
			move(i-1,j+1);
		}
		if(j-1>=0  && !cellStatus[i][j-1] && array[i][j-1]==1){
			count++;
			cellStatus[i][j-1]=true;
			move(i,j-1);
		}
		if(j+1<m  && !cellStatus[i][j+1] && array[i][j+1]==1){
			count++;
			cellStatus[i][j+1]=true;
			move(i,j+1);
		}
		if(i+1<n && j-1>=0 && !cellStatus[i+1][j-1] && array[i+1][j-1]==1 ){
			count++;
			cellStatus[i+1][j-1]=true;
			move(i+1,j-1);
		}
		if(i+1<n && !cellStatus[i+1][j] && array[i+1][j]==1 ){
			count++;
			cellStatus[i+1][j]=true;
			move(i+1,j);
		}
		if(i+1<n && j+1<m && !cellStatus[i+1][j+1] && array[i+1][j+1]==1 ){
			count++;
			cellStatus[i+1][j+1]=true;
			move(i+1,j+1);
		}	
	}

}
