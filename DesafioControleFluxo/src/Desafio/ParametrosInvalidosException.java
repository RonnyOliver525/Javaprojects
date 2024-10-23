package Desafio;

public class ParametrosInvalidosException extends Exception {
	public ParametrosInvalidosException(String message) {
		super(message); // classe de exceção que exibirá uma mensagem caso o número não satisfaça a regra de negócio.
	}
}