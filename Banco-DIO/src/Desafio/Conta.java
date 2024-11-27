package Desafio;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	private List<String> historico;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.historico = new ArrayList<>();
    }
	
	
	@Override
	public void sacar(double valor) {
		if (valor > saldo) {
            historico.add("Saque de " + valor + " falhou (saldo insuficiente)");
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            historico.add("Saque de " + valor + " realizado com sucesso");
        }
    }

	@Override
	public void depositar(double valor) {
		 saldo += valor;
	        historico.add("Depósito de " + valor + " realizado com sucesso");
	    }

	@Override
	public void transferir(double valor, Conta contaDestino) {
		  if (valor > saldo) {
	            historico.add("Transferência de " + valor + " falhou (saldo insuficiente)");
	            System.out.println("Saldo insuficiente!");
	        } else {
	            this.sacar(valor);
	            contaDestino.depositar(valor);
	            historico.add("Transferência de " + valor + " para conta " + contaDestino.getNumero());
	        }
	    }
		
	public void imprimirHistorico() {
        System.out.println("=== Histórico de Transações ===");
        for (String transacao : historico) {
            System.out.println(transacao);
        }
    }
	
	
	public void fecharConta() {
	    if (saldo > 0) {
	        System.out.println("A conta possui saldo. Retire os fundos antes de fechar.");
	    } else if (saldo < 0) {
	        System.out.println("A conta possui débito. Regularize o saldo antes de fechar.");
	    } else {
	        System.out.println("Conta " + numero + " fechada com sucesso!");
	    }
	    
	}
	
	public void cobrarTaxa(double valorTaxa) {
	    if (saldo >= valorTaxa) {
	        saldo -= valorTaxa;
	        System.out.println("Taxa de manutenção de " + valorTaxa + " cobrada com sucesso.");
	    } else {
	        System.out.println("Saldo insuficiente para cobrar a taxa.");
	    }
	}
	
	public void aplicarJuros(double taxa) {
	    double juros = saldo * (taxa / 100);
	    saldo += juros;
	    System.out.println(String.format("Juros de %.2f aplicados. Novo saldo: %.2f", juros, saldo));
	}

	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		DecimalFormat df = new DecimalFormat("###,##0.00");
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	
}
