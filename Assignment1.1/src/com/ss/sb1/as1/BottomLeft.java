/**
 * 
 */
package com.ss.sb1.as1;

/**
 * @author trevor
 *
 */
public class BottomLeft {

	/**
	 * @param args
	 */
	public static void BottomLeft(int n) {
		for(int i=0; i<n; i++) {
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void underline() {
		System.out.print(" .........");
	}
	
	public static void main(String args[]) {
		int n = 4;
		BottomLeft(n);
		underline();
	}
	


}
