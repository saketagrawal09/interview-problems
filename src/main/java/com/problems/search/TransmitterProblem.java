package com.problems.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TransmitterProblem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
         }
       Arrays.sort(x);     
       int transformerLeftPos = 0,transformerPos=0,transformerRightPos=0;
       List<Integer> transmitterLocations = new ArrayList<Integer>();
       for(;transformerRightPos< x.length-1;){
    	   if((x[transformerPos+1])-x[transformerLeftPos]<=k){
    		   transformerRightPos++;
    		   transformerPos++;    		   
    	   }else if((x[transformerRightPos+1])-x[transformerPos]<=k){
    		   transformerRightPos++;
    		   
    	   }else{
    		   transformerLeftPos= transformerRightPos+1;
    		   transmitterLocations.add(transformerPos);
    		   transformerPos= transformerRightPos+1;
    		   transformerRightPos = transformerRightPos +1;
    		   
    	   }
    	   
       }
       if(!transmitterLocations.contains(transformerPos)){
          
           transmitterLocations.add(transformerPos);
       }
       System.out.println(transmitterLocations.size());
         

	}

}
