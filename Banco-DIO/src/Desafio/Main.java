package Desafio;

import java.util.List;

public class Main  {

	public static void main(String[] args) {
		
		Cliente ronny = new Cliente();
		ronny.setNome("Ronny");
		
		Conta cc = new ContaCorrente(ronny);
		Conta poupanca = new ContaPoupanca(ronny);
		
		Banco banco = new Banco("Banco Central");
	    banco.adicionarConta(cc);
	    banco.adicionarConta(poupanca);
		
	    List<Conta> contasRonny = banco.buscarContasPorNome("Ronny");
	    for (Conta conta : contasRonny) {
	        conta.imprimirExtrato();
	    }
		
		cc.depositar(500);
		cc.transferir(200, poupanca);
		    
		poupanca.depositar(1000);
		poupanca.aplicarJuros(1.5);
		
		
		
		cc.depositar(500);
		cc.cobrarTaxa(15);// Cobrar taxa de manutenção
		cc.imprimirExtrato();
		
		
	    poupanca.imprimirExtrato();
	
	    banco.listarContas();
	
	    poupanca.imprimirHistorico();
	    cc.imprimirHistorico();
		
	}

}
