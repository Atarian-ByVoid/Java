package br.fepi.exemplo.app;

import br.fepi.exemplo.Quadrado;
import br.fepi.exemplo.Quadrilatero;
import br.fepi.exemplo.Retangulo;
import br.fepi.exemplo.Trapezio;

public class App {
	public static void main(String[] args) {
		
		Retangulo q = new Retangulo(10, 20);
		
		System.out.println("Ret�ngulo");
		System.out.println("�rea: "+q.area());
		System.out.println("Per�metro: "+ q.perimetro());
		
		Quadrado quadrado = new Quadrado(20);
		
		System.out.println("\nQuadrado");
		System.out.println("�rea: "+quadrado.area());
		System.out.println("Per�metro: "+quadrado.perimetro());
		
		
		Trapezio t = new Trapezio();
		t.setL1(10);
		t.setL2(20);
		t.setL3(20);
		t.setL4(15);
		t.setAltura(12);
		
		System.out.println("\nTrap�zio");
		System.out.println("�rea: "+t.area());
		System.out.println("Per�metro: "+t.perimetro());
		
		
	}
}
