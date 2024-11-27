package Desafio;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void listarContas() {
        System.out.println("=== Lista de Contas ===");
        for (Conta conta : contas) {
            System.out.println(String.format("Titular: %s | Agência: %d | Número: %d",
                    conta.cliente.getNome(), conta.getAgencia(), conta.getNumero()));
        }
        
    }
    
    public List<Conta> buscarContasPorNome(String nome) {
        List<Conta> contasEncontradas = new ArrayList<>();
        for (Conta conta : contas) {
            if (conta.cliente.getNome().equalsIgnoreCase(nome)) {
                contasEncontradas.add(conta);
            }
        }
        return contasEncontradas;
    }
}

    