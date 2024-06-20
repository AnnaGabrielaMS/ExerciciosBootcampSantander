
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente cliente1 = new Cliente("Anna");
		Cliente cliente2 = new Cliente("Gabriela");
		Cliente cliente3 = new Cliente("Gabi");

		Conta cc1 = new ContaCorrente(cliente1);
		Conta cp = new ContaCorrente(cliente2);
		Conta cc2 = new ContaCorrente(cliente3);

		cc1.depositar(150.0);
		cc1.transferir(50.0, cp);
		cc2.depositar(300.00);
		cp.sacar(10.00);
		cc2.sacar(5.00);

		System.out.println("\nClientes do banco:");
		banco.exibirContas();

	}

}
