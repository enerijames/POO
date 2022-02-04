package classe.modelo;

public final class ContaEspecial extends Conta{
	
	private double limite;
	
	public ContaEspecial() {
		super();
	}
	
	public ContaEspecial(int numeroConta, Correntista correntista, double saldo, double limite)  {
		super(numeroConta, correntista, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	
	
	/*	
	public double getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
*/
	@Override
	public String sacar(double valor) {

		if(this.getSaldo() + this.getLimite() - valor >= 0) {
			this.setSaldo(this.getSaldo() - valor);
			return "Saque no valor de R$"+ valor +" realizado com sucesso";
		}
		return ("Não há saldo suficiente na conta, seu saldo é de R$"+this.getSaldo());
	}
}
