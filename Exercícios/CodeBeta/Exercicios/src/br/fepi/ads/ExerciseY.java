package br.fepi.ads;

import javax.swing.JOptionPane;

public class ExerciseY {

	public static void main(String[] args) {

		String A = "";
		int num = 0;
		int ant = 0;
		int suces = 0;
		String saida = "";
		
		A = JOptionPane.showInputDialog("Entre com um n�mero");
		num = Integer.parseInt(A);
		
		ant = num -1;
		suces = num +1;
		
		saida +=" O antecessor de " + num + "�" + ant;
		saida +=" \n O sucessor de " + num + "�" + suces;
		
		JOptionPane.showMessageDialog(null, saida);
		

	}
}
