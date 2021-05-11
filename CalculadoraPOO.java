package Calculadora01;

import java.util.Scanner;

public class CalculadoraPOO extends Operacoes{

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Operacoes calculo = new Operacoes();

		calculo.resetaOpcao();
		int x = 0;
		while (opcao != x) {

			if (opcao >= 1 && opcao <= 6) {

				switch (opcao) {

				case 1:
					calculo.soma();
					break;
				case 2:
					calculo.subtracao();
					break;
				case 3:
					calculo.multiplicacao();
					break;
				case 4:
					calculo.divisao();
					break;
				case 5:
					calculo.raizQuadrada();
					break;
				case 6:
					calculo.potencia();
					break;
				}
				
			} else {

				System.out.println("\n## CALCULADORA ##\n " + "\nESCOLHA A OPERAÇÃO:\n " + "\n1 - Soma "
						+ "\n2 - Subtração " + "\n3 - Multiplicação " + "\n4 - Divisão " + "\n5 - Raiz quadrada"
						+ "\n6 - Pontência " + "\n0 - Sair");

				System.out.print("\nDigite um número entre 1 e 6: ");
				opcao = ler.nextInt();
			}
		}
		
		System.out.println("\n### APLICAÇÃO ENCERRADA ###");
		ler.close();
	}

}
