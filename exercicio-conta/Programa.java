package application;

import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Conta c1 = new Conta(520, "Pedro");
		Conta c2 = new Conta(785, "Luiz");

		c1.depositar(150);
		c1.mostraSaldo();
		c2.mostraSaldo();
				
		double valor = 0;
		while (true) {

			if (c1.getSaldo() >= valor) {
				System.out.print("Digite o valor da transfer�ncia: ");
				valor = ler.nextDouble();
				c1.transferir(valor, c2);
				c1.mostraSaldo();
				c2.mostraSaldo();
				valor = 0;

			} else if (c1.getSaldo() < valor) {
				System.out.println("Saldo insuficiente para transfer�ncia.");
				valor = 0;

			} 
			
			if(c1.getSaldo() == 0){
				
				System.out.println("N�o existe mais saldo!\nAplica��o encerrada, tente depositar algum valor.");
				break;

			}

		}

		ler.close();
	}
	


}
