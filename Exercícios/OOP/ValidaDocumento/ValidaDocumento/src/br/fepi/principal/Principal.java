package br.fepi.principal;

import java.util.ArrayList;

import br.fepi.model.Fisica;
import br.fepi.model.Juridica;
import br.fepi.model.Pessoa;

public class Principal {
	public static void main(String[] args) {
//		Pessoa p = new Pessoa();
//		p.setNome("Jo�o");
//		p.escreverNome();

//		Fisica pf = new Fisica("12345678910");
//
//		if (pf.validarCPF()) {
//			System.out.println("CPF v�lido");
//		} else {
//			System.err.println("CPF inv�lido");
//		}

//		Juridica pj = new Juridica("12345678910001");
//
//		if (pj.validarCnpj()) {
//			System.out.println("CPNJ v�lido");
//		} else {
//			System.err.println("CNPJ inv�lido");
//		}

		Fisica pf1 = new Fisica("123456789110");
		Fisica pf2 = new Fisica("12345678912");
		pf1.setNome("Jo�o");
		pf2.setNome("Maria");
		
		Juridica pj1 = new Juridica("12345678910001");
		Juridica pj2 = new Juridica("123456789100021");
		pj1.setNome("Magalu");
		pj2.setNome("Extra");

		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		lista.add(pf1);
		lista.add(pf2);
		lista.add(pj1);
		lista.add(pj2);
		
		for (Pessoa pessoa : lista) {
			System.out.println("Nome: " + pessoa.getNome());
			
			if(pessoa.validarDocumento()) {
				System.out.println("Documento v�lido");
			}else {
				System.err.println("Documento inv�lido");
			}
			System.out.println("------------------------");
			
		}
		
	}
}
