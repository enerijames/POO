package classe.modelo;

public class ContaPoupanca extends Conta{
	
	
	public ContaPoupanca(int codigo, Correntista correntista, double saldo	)  {

		super(codigo, correntista, saldo);
		
	}
	
	public void atualizarSaldo(float juros) {
		this.setSaldo(this.getSaldo() + juros);
	}

}
