package Desafio;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        boolean validInput = false; // codigo que verifica se o input é correto

        while (!validInput) {
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
                validInput = true; // verdadeiro caso nõo ocorra exceção caso ocorra, ele retorna a exceção para o usuário e reinicia.
            } catch (ParametrosInvalidosException exception) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro! Tente novamente.");
            }
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }

        int contagem = parametroDois - parametroUm;

        for (int x = 1; x <= contagem; x++) {
            System.out.println("Contagem número: " + x);
        }
    }
}


