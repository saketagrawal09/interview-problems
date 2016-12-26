package com.problems.search;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

/*	Ice Cream Parlor
 *  Each time Sunny and Johnny take a trip to the Ice Cream Parlor, they pool together "m" dollars for ice cream. On any given day, the parlor offers a line of "n" flavors. Each flavor,"i" , is numbered sequentially with a unique ID number from 1 to "n" and has a cost, Ci , associated with it.
	
	Given the value of "m" and the cost of each flavor for "t" trips to the Ice Cream Parlor, help Sunny and Johnny choose two flavors such that they spend their entire pool of money (m) during each visit. For each trip to the parlor, print the ID numbers for the two types of ice cream that Sunny and Johnny purchase as two space-separated integers on a new line. You must print the smaller ID first and the larger ID second.

Input Format

The first line contains an integer, t, denoting the number of trips to the ice cream parlor. The 3t subsequent lines describe all of Sunny and Johnny's trips to the parlor; each trip is described as follows:

1.The first line contains "m".
2.The second line contains "n".
3.The third line contains "n" space-separated integers denoting the cost of each respective flavor. The ith integer corresponding to the cost,Ci , for the ice cream with ID number  (where ).
Sample Input

2
4
5
1 4 5 3 2
4
4
2 2 4 3
Sample Output

1 4
1 2

*/
		public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scanner = new Scanner(System.in);
	        int numberOfTrip= scanner.nextInt();
	        for(int i=0;i<numberOfTrip;i++){
	        	
	            int AmountCarried= scanner.nextInt();
	            int numberOfIceCream = scanner.nextInt();
	            int [] iceCreamVarity = new int[numberOfIceCream];
	            
	            for(int j=0;j<numberOfIceCream;j++){
	            	iceCreamVarity[j]=scanner.nextInt();
	            }
	            System.out.println(Arrays.toString(iceCreamVarity));
	            search:
	            for(int k=0;k<iceCreamVarity.length;k++){
	            	for(int j=k+1;j<iceCreamVarity.length;j++){
		            	if(AmountCarried ==iceCreamVarity[k]+iceCreamVarity[j]){
		            		System.out.println((k+1) +" "+(j+1));
		            		break search;
		            	}
	            	}
	            }
	            
	        }
	    }

	

}
