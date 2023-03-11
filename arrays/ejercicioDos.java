package arrays;

import java.util.Arrays;

public class ejercicioDos {

	public static void main(String[] args) {
		
		int[] vector = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int guardar=vector[vector.length-1];

		System.out.println(Arrays.toString(vector));
		for (int i=vector.length-1;i>0;i--) {
						
			vector[i]=vector[i-1];
						
		}
		vector[0]=guardar;
		System.out.println(Arrays.toString(vector));
	}
	
}
