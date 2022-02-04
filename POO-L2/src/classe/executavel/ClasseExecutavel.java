package classe.executavel;
import classe.modelo.Correntista;
import classe.modelo.ContaPoupanca;
import classe.modelo.ContaEspecial;

public class ClasseExecutavel {
	public static void main(String[] args) {
		
		Correntista correntista = new Correntista ("Clicano", 999123456, "ciclano.gmail");
		/*ContaEspecial especial = new ContaEspecial(3322, correntista, 1500, 500);
	
		System.out.println("Conta número.................: "+correntista.getNome());
		System.out.println("Saldo.................: R$"+especial.getSaldo());
		System.out.println(especial.sacar(150f));
		System.out.println(especial.movimentar(500, 0));
		System.out.println("Saldo.................: R$"+especial.getSaldo());
		
		*/
		
		ContaEspecial conta1 = new ContaEspecial(3322, correntista, 1500, 500);
		ContaPoupanca conta2 = new ContaPoupanca(1234, correntista, 1000);

		System.out.println("Conta Especial");
		System.out.println(conta1.sacar(500));
		System.out.println("Saldo.................: R$"+conta1.getSaldo());
		System.out.println(conta1.sacar(1400));
		System.out.println("Saldo.................: R$"+conta1.getSaldo());
		System.out.println(conta1.sacar(200));
		System.out.println("Saldo.................: R$"+conta1.getSaldo());
		conta1.depositar(200);
		System.out.println("Saldo.................: R$"+conta1.getSaldo());
		System.out.println("Conta Poupança");
		System.out.println("Saldo.................: R$"+conta2.getSaldo());
		conta2.atualizarSaldo(500);
		System.out.println("Saldo.................: R$"+conta2.getSaldo());
		
	/*	conta1 = new ContaEspecial(3322, correntista, 1500, 500);
		conta2 = new ContaEspecial(3322, correntista, 1500, 500);
		conta3 = new ContaEspecial(3322, correntista, 1500, 500);
		System.out.println(Conta.getNumeroContas());

		conta4 = new ContaComum(3322, correntista, 1500);
		conta5 = new ContaComum(3322, correntista, 1500);
		conta6 = new ContaComum(3322, correntista, 1500);
		System.out.println(Conta.getNumeroContas());*/

	}
}
