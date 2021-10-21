/**
 * 
 */
package com.ss.sb1.as1;

/**
 * @author trevor
 *
 */
public class Upvote {

	/**
	 * @param args
	 */
	public static void Upvote(int n) {
		for (int i=0; i<n*2; i += 2) {
			for (int j=n-i/2+2; j>1; j--)
			{
				System.out.print(" ");
			}
			for ( int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void underline() {
		System.out.print("...........");
	}
	
	public static void main(String args[]) {
		int n = 4;
		Upvote(n);
		underline();
	}

}
