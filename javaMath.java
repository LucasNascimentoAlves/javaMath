package br.ucsal.edu;

import java.util.Scanner;

public class JavaMath {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		
		int primeiroNumero;
		primeiroNumero = sc.nextInt();
		
		System.out.println("Digite o segundo número");
		
		int segundoNumero;
		segundoNumero = sc.nextInt();
		
		System.out.println(primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero+segundoNumero));
		System.out.println(primeiroNumero + " - " + segundoNumero + " = " + (primeiroNumero-segundoNumero));
		System.out.println(primeiroNumero + " * " + segundoNumero + " = " + (primeiroNumero*segundoNumero));
		System.out.println(primeiroNumero + " / " + segundoNumero + " = " + (primeiroNumero/segundoNumero));
		System.out.println(primeiroNumero + " mod " + segundoNumero + " = " + (primeiroNumero%segundoNumero));
		
		
	}

}
