package Calculadora01;

import java.util.Scanner;

public class Operacoes {

	Scanner ler = new Scanner(System.in);

	public double numero1, numero2, resultado; 
	public static int opcao;

	public void solicitaUmNumero() {

		System.out.print("Digite o número: ");
		numero1 = ler.nextInt();
	}

	public void solicitaDoisNumeros() {

		System.out.print("Digite o primeiro número: ");
		numero1 = ler.nextInt();
		System.out.print("Digite o segundo núremo: ");
		numero2 = ler.nextInt();

	}

	public void imprimiResultado() {
		System.out.println("O resultado é: " + resultado);
		verificaSeParSeImparSeDivisivelPor3();
		resetaOpcao();
	}

	public void resetaOpcao() {
		opcao = 10;
	}
	
	public void soma() {
		solicitaDoisNumeros();
		resultado = numero1 + numero2;
		imprimiResultado();
		
	}

	public void subtracao() {
		solicitaDoisNumeros();
		resultado = numero1 - numero2;
		imprimiResultado();

	}

	public void multiplicacao() {
		solicitaDoisNumeros();
		resultado = numero1 * numero2;
		imprimiResultado();
	}

	public void divisao() {
		solicitaDoisNumeros();
		resultado = numero1 / numero2;
		imprimiResultado();
	}

	public void raizQuadrada() {
		solicitaUmNumero();
		resultado = Math.sqrt(numero1);
		imprimiResultado();
	}

	public void potencia() {
		solicitaDoisNumeros();
		resultado = Math.pow(numero1, numero2);
		imprimiResultado();
	}

	public void verificaSeParSeImparSeDivisivelPor3() {

		if (resultado % 2 == 0) {

			System.out.println("O resultado é par.");

		} else {

			System.out.println("O resultado é ímpar.");
		}

		if (resultado % 3 == 0) {

			System.out.println("O resultado é divisível por 3.");
		} else {

			System.out.println("O resultado NÃO é divisível por 3.");
		}

	}

}
