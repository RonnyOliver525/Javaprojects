package Desafio;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		super.imprimirInfosComuns();
		
	}
	
	
	public void aplicarJuros(double taxa) {
	    double juros = saldo * (taxa / 100);
	    saldo += juros;
	    System.out.println(String.format("Juros de %.2f aplicados. Novo saldo: %.2f", juros, saldo));
	}
	
}
