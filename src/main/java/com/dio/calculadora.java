package com.dio;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o valor de a: ");
		a = scan.nextInt();
		System.out.println("Digite o valor de b ");
		b = scan.nextInt();

		double soma = soma(a, b);
		double subtracao = subtracao(a, b);
		double divisao = divisao(a, b);
		double multiplicacao = multiplicacao(a, b);
		
		System.out.println(soma);
		System.out.println(subtracao);

		System.out.println(multiplicacao);
	}
	
	public static double soma(double a, double b){
		return a + b;
	}
	public static double subtracao(double a, double b){
		return a - b;
	}
	public static double divisao(double a, double b){
		return a / b;
	}
	public static double multiplicacao(double a, double b){
		return a * b;
	}
}
