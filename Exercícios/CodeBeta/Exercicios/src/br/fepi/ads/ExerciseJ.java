package br.fepi.ads;

import java.util.Scanner;



public class ExerciseJ {

	public static void main(String[] args) {
	
		
		Scanner entrada = new Scanner(System.in);
		
		int A , B ;
		double C;
		
		System.out.println("Valor A");
		A = entrada.nextInt();
		
		System.out.println("Valor B");
		B = entrada.nextInt();
		
		C = (A * A) - (2 * A * B) + (B * B ) ;
		System.out.println("O quadrado da diferen�a entra A e B � igual a:");
        System.out.printf("%.2f ",C );
        
        entrada.close();
		
		
		
		
			
		
		
		
		
		
		
	}

}
