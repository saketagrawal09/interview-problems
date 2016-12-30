package com.problems.search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GridlandMetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String dimension = scanner.nextLine();
		String [] R1 = dimension.split(" ");
		int totalRows= Integer.parseInt(R1[0]);
		int totalColumn = Integer.parseInt(R1[1]);
		int totalTrack = Integer.parseInt(R1[2]);
		List<String> list = new ArrayList<String>();
		for (int i = 1; i <= totalTrack; i++) {
			list.add(scanner.nextLine());
		}
		int sum =0;
		for (String string : list) {
			String [] trackDetails= string.split(" ");
			int rows =Integer.parseInt(trackDetails[0]);
			int C1 =Integer.parseInt(trackDetails[1]);
			int C2 =Integer.parseInt(trackDetails[2]);
			
			for (int j = 1; j <= totalRows; j++) {
			
				for(int i = 1;i<=totalColumn;i++){
					if(list.size() != totalRows){sum=sum+totalColumn;}
					if(i<C1)sum++;
					if(i>C2)sum++;
				}
				}
		}
		System.out.println(sum);
		
		
		}

	

}
