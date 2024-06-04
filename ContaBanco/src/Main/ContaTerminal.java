package Main;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int numero;
		String agencia;
		String titular;
		double saldo;
		
	
		System.out.println("----------BEM-VINDO AO BANCO SÃOTANDERA!----------");
		System.out.println("--------------------------------------------------");
		System.out.println("Por favor, digite o número da conta: ");
		numero =scan.nextInt();
		
		System.out.println("Digite o núero da agência: ");
		agencia = scan.next();
		
		System.out.println("Informe o titular da conta: ");
		titular = scan.next();
		scan.nextLine();
		
		System.out.println("Me informe seu saldo atual: ");
		saldo = scan.nextDouble();
		
		System.out.println();
		System.out.printf("Olá %S, muito obrigado por criar uma conta em" 
		+" nosso banco, sua agência é %s, conta %d"
		+" e seu saldo %.2f já está disponível para saque.", titular, agencia, numero, saldo);

		
	
	



	
		
	
	
	
	
	
	}
	
	
}	

	
	

	

