package br.fepi.ads;

import java.util.Scanner;

public class ExerciseI {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);

int a,b,c,d;

System.out.println("Valor de A");
a=input.nextInt();
System.out.println("Valor de B");
b=input.nextInt();
System.out.println("Valor de C");
c=input.nextInt();
System.out.println("Valor de D");
d=input.nextInt();

//////Maior teste

	if(a>b && a>c && a>d) {
	System.out.println("Maior valor � A");
	//////////////////////////////////////
	}else if(b>c && c>d) {
	System.out.println("Maior valor � B");
	//////////////////////////////////////
	}else if(c>d) {
	System.out.println("Maior valor � C");
	//////////////////////////////////////
	}else {
	System.out.println("Maior valor � D");
	//////////////////////////////////////
	
	}
	
	////////////////////////////////////////////////////////////////////////////

	////////Menor teste
	
	if(a<b && a<c && a<d) {
	System.out.println("Menor valor � A");
	//////////////////////////////////////
	}else if(b<c && c<d) {
	System.out.println("Menor valor � B");
	//////////////////////////////////////
	}else if(c<d) {
	System.out.println("Menor valor � C");
	//////////////////////////////////////
	}else {
	System.out.println("Menor valor � D");
	//////////////////////////////////////

	}
	
	
input.close();
}
	}
