package q1.escada;

import java.util.Scanner;

public class Escada_Q1 {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
		
		System.out.println("Entrada:");
		System.out.print("n = ");
		int n = scan.nextInt();
		System.out.println();

		int degrau = 0;	
		System.out.println("Saída:");

		for ( int i = 1; i <= n; i++) {

			degrau++;

			for(int j=n; j>=i+1; j--) {

				System.out.print(" ");

			}

	
			for(int k=0; k<=degrau-1;k++) 
				 {
                  System.out.print("*");
					}

				 System.out.println();

			}

		

				scan.close();

	}

}
