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
					System.out.print("Digite o primeiro n�mero: ");
					double numero1 = ler.nextDouble();
					System.out.print("Digite o segundo n�mero: ");
					double numero2 = ler.nextDouble();
					double soma = numero1 + numero2;
					System.out.println("Resultado: " + soma);
					if (soma % 2 == 0) {
						System.out.println("Esse resultado � par.");
						System.out.println("Esse resultado n�o � divis�vel por 3.");

					} else {
						System.out.println("Esse resultado � impar.");
						if (soma % 3 == 0) {
							System.out.println("Esse resultado � divis�vel por 3.");
						} else {
							System.out.println("Esse resultado n�o � divis�vel por 3.");
						}
					}
					opcao = 10;
					break;

				case 2:
					System.out.print("Digite o primeiro n�mero: ");
					double numero3 = ler.nextDouble();
					System.out.print("Digite o segundo n�mero: ");
					double numero4 = ler.nextDouble();
					double subtracao = numero3 - numero4;
					System.out.println("Resultado: " + subtracao);
					if (subtracao % 2 == 0) {
						System.out.println("Esse resultado � par.");
						System.out.println("Esse resultado n�o � divis�vel por 3.");

					} else {
						System.out.println("Esse resultado � impar.");
						if (subtracao % 3 == 0) {
							System.out.println("Esse resultado � divis�vel por 3.");
						} else {
							System.out.println("Esse resultado n�o � divis�vel por 3.");
						}
					}
					opcao = 10;
					break;

				case 3:
					System.out.print("Digite o primeiro n�mero: ");
					double numero5 = ler.nextDouble();
					System.out.print("Digite o segundo n�mero: ");
					double numero6 = ler.nextDouble();
					double multiplicacao = numero5 * numero6;
					System.out.println("Resultado: " + multiplicacao);
					if (multiplicacao % 2 == 0) {
						System.out.println("Esse resultado � par.");
						System.out.println("Esse resultado n�o � divis�vel por 3.");

					} else {
						System.out.println("Esse resultado � impar.");
						if (multiplicacao % 3 == 0) {
							System.out.println("Esse resultado � divis�vel por 3.");
						} else {
							System.out.println("Esse resultado n�o � divis�vel por 3.");
						}
					}
					opcao = 10;
					break;

				case 4:
					System.out.print("Digite o primeiro n�mero: ");
					double numero7 = ler.nextDouble();
					System.out.print("Digite o segundo n�mero: ");
					double numero8 = ler.nextDouble();
					double divisao = numero7 / numero8;
					System.out.println("Resultado: " + divisao);
					if (divisao % 2 == 0) {
						System.out.println("Esse resultado � par.");
						System.out.println("Esse resultado n�o � divis�vel por 3.");

					} else {
						System.out.println("Esse resultado � impar.");
						if (divisao % 3 == 0) {
							System.out.println("Esse resultado � divis�vel por 3.");
						} else {
							System.out.println("Esse resultado n�o � divis�vel por 3.");
						}
					}
					opcao = 10;
					break;

				case 5:
					System.out.print("Digite o n�mero para raiz quadrada: ");
					int numero9 = ler.nextInt();
					double raizquadrada = Math.sqrt(numero9);

					if (raizquadrada % 2 == 0) {
						System.out.println("Resultado: " + raizquadrada);
						System.out.println("Esse resultado � par.");
						System.out.println("Esse resultado n�o � divis�vel por 3.");

					} else if (raizquadrada % 3 == 0) {
						System.out.println("Resultado: " + raizquadrada);
						System.out.println("Esse resultado � �mpar.\n" + "Esse resultado � divis�vel por 3.");
					} else if (raizquadrada % 3 != 0) {
						System.out.println("Esse resultado n�o tem raiz quadrada inteira.\n" + "Esse resultado � �mpar.\n" + "Esse resultado n�o � divis�vel por 3.");

					}
					opcao = 10;
					break;

				case 6:
					System.out.print("Digite o n�mero: ");
					double numero10 = ler.nextDouble();
					System.out.print("Digite o expoente: ");
					double numero11 = ler.nextDouble();
					double potencia = Math.pow(numero10, numero11);
					System.out.println("Resultado: " + potencia);
					if (potencia % 2 == 0) {
						System.out.println("Esse resultado � par.");
						System.out.println("Esse resultado n�o � divis�vel por 3.");

					} else {
						System.out.println("Esse resultado � impar.");
						if (potencia % 3 == 0) {
							System.out.println("Esse resultado � divis�vel por 3.");
						} else {
							System.out.println("Esse resultado n�o � divis�vel por 3.");
						}
					}
					opcao = 10;
					break;
				}
			} else {

				System.out.println("\n## CALCULADORA ##\n " + "\nESCOLHA A OPERA��O:\n " + "\n1 - Soma "
						+ "\n2 - Subtra��o " + "\n3 - Multiplica��o " + "\n4 - Divis�o " + "\n5 - Raiz quadrada"
						+ "\n6 - Pont�ncia " + "\n0 - Sair");

				System.out.print("\nDigite um n�mero entre 1 e 6: ");
				opcao = ler.nextInt();
			}
		}

		System.out.println("\n### APLICA��O ENCERRADA ###");
		ler.close();
	}

}
