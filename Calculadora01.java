package Calculadora01;

import java.util.Scanner;

public class Calculadora01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int opcao = 10;
		int x = 0;
		while (opcao != x) {

			if (opcao >= 1 && opcao <= 6) {

				switch (opcao) {

				case 1:
					System.out.print("Digite o primeiro número: ");
					double numero1 = ler.nextDouble();
					System.out.print("Digite o segundo número: ");
					double numero2 = ler.nextDouble();
					double soma = numero1 + numero2;
					System.out.println("Resultado: " + soma);
					if (soma % 2 == 0) {
						System.out.println("Esse resultado é par.");
						System.out.println("Esse resultado não é divisível por 3.");

					} else {
						System.out.println("Esse resultado é impar.");
						if (soma % 3 == 0) {
							System.out.println("Esse resultado é divisível por 3.");
						} else {
							System.out.println("Esse resultado não é divisível por 3.");
						}
					}
					opcao = 10;
					break;

				case 2:
					System.out.print("Digite o primeiro número: ");
					double numero3 = ler.nextDouble();
					System.out.print("Digite o segundo número: ");
					double numero4 = ler.nextDouble();
					double subtracao = numero3 - numero4;
					System.out.println("Resultado: " + subtracao);
					if (subtracao % 2 == 0) {
						System.out.println("Esse resultado é par.");
						System.out.println("Esse resultado não é divisível por 3.");

					} else {
						System.out.println("Esse resultado é impar.");
						if (subtracao % 3 == 0) {
							System.out.println("Esse resultado é divisível por 3.");
						} else {
							System.out.println("Esse resultado não é divisível por 3.");
						}
					}
					opcao = 10;
					break;

				case 3:
					System.out.print("Digite o primeiro número: ");
					double numero5 = ler.nextDouble();
					System.out.print("Digite o segundo número: ");
					double numero6 = ler.nextDouble();
					double multiplicacao = numero5 * numero6;
					System.out.println("Resultado: " + multiplicacao);
					if (multiplicacao % 2 == 0) {
						System.out.println("Esse resultado é par.");
						System.out.println("Esse resultado não é divisível por 3.");

					} else {
						System.out.println("Esse resultado é impar.");
						if (multiplicacao % 3 == 0) {
							System.out.println("Esse resultado é divisível por 3.");
						} else {
							System.out.println("Esse resultado não é divisível por 3.");
						}
					}
					opcao = 10;
					break;

				case 4:
					System.out.print("Digite o primeiro número: ");
					double numero7 = ler.nextDouble();
					System.out.print("Digite o segundo número: ");
					double numero8 = ler.nextDouble();
					double divisao = numero7 / numero8;
					System.out.println("Resultado: " + divisao);
					if (divisao % 2 == 0) {
						System.out.println("Esse resultado é par.");
						System.out.println("Esse resultado não é divisível por 3.");

					} else {
						System.out.println("Esse resultado é impar.");
						if (divisao % 3 == 0) {
							System.out.println("Esse resultado é divisível por 3.");
						} else {
							System.out.println("Esse resultado não é divisível por 3.");
						}
					}
					opcao = 10;
					break;

				case 5:
					System.out.print("Digite o número para raiz quadrada: ");
					int numero9 = ler.nextInt();
					double raizquadrada = Math.sqrt(numero9);

					if (raizquadrada % 2 == 0) {
						System.out.println("Resultado: " + raizquadrada);
						System.out.println("Esse resultado é par.");
						System.out.println("Esse resultado não é divisível por 3.");

					} else if (raizquadrada % 3 == 0) {
						System.out.println("Resultado: " + raizquadrada);
						System.out.println("Esse resultado é ímpar.\n" + "Esse resultado é divisível por 3.");
					} else if (raizquadrada % 3 != 0) {
						System.out.println("Esse resultado não tem raiz quadrada inteira.\n" + "Esse resultado é ímpar.\n" + "Esse resultado não é divisível por 3.");

					}
					opcao = 10;
					break;

				case 6:
					System.out.print("Digite o número: ");
					double numero10 = ler.nextDouble();
					System.out.print("Digite o expoente: ");
					double numero11 = ler.nextDouble();
					double potencia = Math.pow(numero10, numero11);
					System.out.println("Resultado: " + potencia);
					if (potencia % 2 == 0) {
						System.out.println("Esse resultado é par.");
						System.out.println("Esse resultado não é divisível por 3.");

					} else {
						System.out.println("Esse resultado é impar.");
						if (potencia % 3 == 0) {
							System.out.println("Esse resultado é divisível por 3.");
						} else {
							System.out.println("Esse resultado não é divisível por 3.");
						}
					}
					opcao = 10;
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
