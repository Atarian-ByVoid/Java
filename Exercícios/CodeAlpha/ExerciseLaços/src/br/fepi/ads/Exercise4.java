package br.fepi.ads;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

		double soma1,soma2,result;
		
		System.out.println("Valor do primeiro n�mero: ");
		soma1=input.nextDouble();
		System.out.println("Valor do segundo n�mero: ");
		soma2=input.nextDouble();
		
		result=soma1+soma2;
		
		if(result>1000) 
			System.out.println("Finalizado");
		else
		    System.out.println("La�o em execu��o");
		
		input.close();
		
		
		
		
	}

}
