package entities;

public class Conta {
	/**
	 * Atributos da classe:
	 */
	private int numero;
	private String dono;
	private double saldo;
	private double limite;

	/**
	 * Construtores da classe.
	 */
	public Conta() {

	}

	public Conta(int numero, String dono) {

		this.numero = numero;
		this.dono = dono;
	}

	/**
	 * Sessao de métodos da classe:
	 */

	/**
	 * Se houver saldo suficiente, esse método saca um valor(double) da conta.
	 * 
	 * @param valor
	 * @return
	 */
	public boolean sacar(double valor) {

		if (valor <= this.saldo) {

			this.saldo -= valor;
			return true;

		} else {

			System.out.println("Saldo insuficiente.");
			return false;
		}

	}

	/**
	 * Esse método deposita um valor(double) na conta.
	 * 
	 * @param valor
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void transferir(double valor, Conta cc) {

		if (this.saldo >= valor) {

			sacar(valor);
			cc.depositar(valor);
		} else {

			System.out.println("Saldo insuficiente, tente um valor menor.");
		}
	}
	/**
	 * Este método mostra o saldo de forma personalizada.
	 * Ex: Saldo de (nomeDoDono): R$ 100.0
	 */
	public void mostraSaldo() {
		System.out.println("Saldo de " + getDono() + ": R$" + getSaldo());
	}

	/**
	 * Sessao getters e setters:
	 * 
	 * @return
	 */

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", dono=" + dono + ", saldo=" + saldo + ", limite=" + limite + "]";
	}

}
