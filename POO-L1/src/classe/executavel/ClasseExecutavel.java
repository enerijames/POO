package classe.executavel;
import classe.modelo.Conta;
import classe.modelo.Correntista;

public class ClasseExecutavel {
	public static void main(String[] args) {
		
		Correntista Pessoa1 = new Correntista();
		Pessoa1.setNome("Ciclano");
		Pessoa1.setIdade(38);
		Pessoa1.setCpf(1234567890);
		Pessoa1.setIdt(100112345);
		Pessoa1.setTelefone(999123456);
		
		Conta Conta1 = new Conta(1000.00, 500.00);
		Conta1.setCorrentista(Pessoa1);
		Conta1.setTipoConta(1);
		Conta1.setNumeroConta(1234);
		
		System.out.println("Conta número.................: "+Conta1.getNumeroConta());
		System.out.println("Correntista..................: "+Conta1.getCorrentista().getNome());
		System.out.println("A idade é....................: "+Conta1.getCorrentista().getIdade());
		System.out.println("Saldo......................R$: "+Conta1.getSaldo());

		Conta1.depositar(1000.00);
		System.out.println("Saldo após depósito........R$: "+Conta1.getSaldo());
		
		if(Conta1.sacar(150.00)) {
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente para saque!");
		}
		System.out.println("Saldo.......................R$: "+Conta1.getSaldo());
		Conta1.extrato();

	}
}
