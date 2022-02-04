package classe.modelo;

//import java.util.ArrayList;

public class Conta {

	private int numeroConta;
	private Correntista correntista;
	private double saldo;
	private double limite;
	//private ArrayList<Double> extratoValores = new ArrayList<>();

	public Conta() {
		
	}

	public Conta(int numeroConta, Correntista correntista, double saldo) {
		this.numeroConta = numeroConta;
		this.correntista = correntista;
		this.saldo = saldo;
		this.limite = 0;
	}






	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
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

	public final void depositar (double valor) {
		this.saldo += valor;	
	}

	public String sacar(double valor) {	
		if(this.saldo - valor >= 0) {
			this.saldo = this.saldo - valor;
			return "Saque no valor de R$"+ valor +" realizado com sucesso";
		}
		return ("Não há saldo suficiente na conta, seu saldo é de R$"+this.saldo);
	}
	
	/*
	public final boolean movimentar (float valor, int tipo) {
		if(tipo == SACAR) {
			this.sacar(valor);
		}else if (tipo == DEPOSITAR) {
			this.depositar(valor);
		}
		return true;
	}



	public void extrato() {
		System.out.println("--------Extrato--------");
		for(int i = 0; i < extratoValores.size(); i++) {
			System.out.println("M - R$"+extratoValores.get(i));
		}
		System.out.println("Saldo.......................R$:"+this.getSaldo());
		System.out.println("-----------------------");
	}
	*/
}
