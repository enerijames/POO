package classe.modelo;

import java.util.ArrayList;

public class Conta {

	private int numeroConta;
	private int tipoConta;
	private double limite;
	private double saldo;
	private Correntista Correntista;
	private ArrayList<Double> extratoValores = new ArrayList<>();
	
	public Conta(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Correntista getCorrentista() {
		return Correntista;
	}
	public void setCorrentista(Correntista correntista) {
		Correntista = correntista;
	}
	public void depositar (double valor) {
		this.saldo = this.saldo + valor;
		this.extratoValores.add(valor);
	}
	public boolean sacar(double valor) {	
		if(this.saldo - valor >= 0) {
			this.saldo = this.saldo - valor;
			this.extratoValores.add(valor*-1);
			return true;
		}
		return false;
	}
	
	public void extrato() {
		System.out.println("--------Extrato--------");
		for(int i = 0; i < extratoValores.size(); i++) {
			System.out.println("M - R$"+extratoValores.get(i));
		}
		System.out.println("Saldo.......................R$:"+this.getSaldo());
		System.out.println("-----------------------");
	}
	
}
