/**
 * @(#)ifelsescanner.java
 *
 *
 * @author 
 * @version 1.00 2019/9/19
 */

import java.util.Scanner;
public class ifelsescanner {

	public static void main (String [] args ){
		Scanner input = new Scanner (System.in);
		
		int nilai ;
		
		System.out.print("masukkan nilai = ");
		nilai = input.nextInt();
		
		if (nilai == 1 ) {
			System.out.println ("angka yang di masukan adalah satu ");
			}
			else 
				System.out.println ("angka yang di masukan buka satu");
	}
}