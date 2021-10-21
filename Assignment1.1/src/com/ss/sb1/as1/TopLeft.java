/**
 * 
 */
package com.ss.sb1.as1;

/**
 * @author trevor
 *
 */
public class TopLeft {

	/**
	 * @param args
	 */
	public static void BottomLeft(int n) {
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void topDots() {
		System.out.print("..........");
		System.out.println();
	}
	
	public static void main(String args[]) {
		int n = 4;
		topDots();
		BottomLeft(n);
	}

}
