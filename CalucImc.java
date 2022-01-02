package calculoimc;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalucImc {

	public static void main(String[] args) {
		
		// Calcular Imc
		String nome;
		double peso, altura,imc;
		
		
		//OBJETOS
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		System.out.println("BEM VINDO AO CALCULO DO IMC: ");
		
		System.out.print("Digite seu nome: ");
		nome = entrada.nextLine(); 
		
		System.out.print("Digite o seu peso: "); 
		peso = entrada.nextDouble();
		
		System.out.print("Digite sua altura: ");
		altura = entrada.nextDouble();  
		 
		//PROCESSAMENTO 
		imc = peso / (altura * altura);
		
		//SAIDA
		System.out.println(nome +  " O SEU IMC É: " + formatador.format(imc));
		
		// VERIFICAÇÃO DO IMC
		if(imc < 18) {
			System.out.println("Abaixo do peso: GRAU DE OBESIDADE: 0");
		}else if(imc >= 18.1 && imc < 24.9) {
			System.out.println("Peso normal: GRAU DE OBESIDADE: 0");
		}else if(imc >= 25.1 && imc < 29.9) {
			System.out.println("Sobrepeso: GRAU DE OBESIDADE: 1");
		}else if(imc >= 30.0 && imc < 39.0) {
			System.out.println("OBESIDADE: GRAU DE OBESIDADE: 2");
		}else if(imc > 40) {
			System.out.println("OBESIDADE GRAVE: GRAU DE OBESIDADE: 3"); 
		}else {
			System.out.println("IMPOSSIVEL REALIZAR O CALCULO");
		}
		entrada.close();
	}
}
