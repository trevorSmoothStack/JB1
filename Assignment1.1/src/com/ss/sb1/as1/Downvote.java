/**
 * 
 */
package com.ss.sb1.as1;

/**
 * @author trevor
 *
 */
public class Downvote {

	/**
	 * @param args
	 */
	public static void Downvote(int n) {
		for (int i=0; i<=n*2; i += 2) {
			for (int j=0; j<=i/2+1; j++) 
			{
				System.out.print(" ");
			}
			for (int j=0; j<n*2-i-1; j++)
			{ 
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void topline() {
		System.out.print("............");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int n = 4;
		topline();
		Downvote(n);
	}

}
