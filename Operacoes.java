package Calculadora01;

import java.util.Scanner;

public class Operacoes {

	Scanner ler = new Scanner(System.in);

	public double numero1, numero2, resultado; 
	public static int opcao;

	public void solicitaUmNumero() {

		System.out.print("Digite o n�mero: ");
		numero1 = ler.nextInt();
	}

	public void solicitaDoisNumeros() {

		System.out.print("Digite o primeiro n�mero: ");
		numero1 = ler.nextInt();
		System.out.print("Digite o segundo n�remo: ");
		numero2 = ler.nextInt();

	}

	public void imprimiResultado() {
		System.out.println("O resultado �: " + resultado);
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

			System.out.println("O resultado � par.");

		} else {

			System.out.println("O resultado � �mpar.");
		}

		if (resultado % 3 == 0) {

			System.out.println("O resultado � divis�vel por 3.");
		} else {

			System.out.println("O resultado N�O � divis�vel por 3.");
		}

	}

}
