package br.fepi.ads;

import java.util.Scanner;

public class ExerciseM {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int x,soma;

System.out.println("Valor de X: ");
x=input.nextInt();

soma=x*2;

if(soma>30)
	System.out.println("Est� dentro");
else
	System.out.println("N�o est� dentro");

input.close();




	}

}
