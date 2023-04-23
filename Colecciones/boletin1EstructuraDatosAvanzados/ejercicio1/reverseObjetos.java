package boletin1EstructuraDatosAvanzados.ejercicio1;

import java.util.Arrays;

public class reverseObjetos {

	public static void main(String[] args) {

		String[] nombres = {"pepe","juan","luis","cristina","fran"}; 
		
		System.out.println(Arrays.toString(nombres));
		
		System.out.println(Arrays.toString(reverse(nombres)));

	}
	
	protected static <T> T[] reverse (T[] arrayaOriginal) {
	
		@SuppressWarnings("unchecked")
		T[]rever = (T[]) new Object[arrayaOriginal.length];
		
		for(int i=0;i<arrayaOriginal.length;i++) {
			rever[i]=arrayaOriginal[arrayaOriginal.length-1-i];
		}
		
		return rever;
	}

}
