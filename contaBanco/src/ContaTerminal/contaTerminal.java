package ContaTerminal;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Por favor, digite o seu nome:");
		String nome = sc.next();
		
		System.out.println("Por favor, digite o n�mero da agencia:");
		int agencia = sc.nextInt();
		
		System.out.println("Por favor, digite o n�mero da Conta:");
		String conta = sc.next();
		
		System.out.println("Por favor, digite o valor do dep�sito inicial:");
		Double valor = sc.nextDouble();

		System.out.println("Ol� "+nome+", Obrigado por criar uma conta em nosso banco, sua agencia � "+agencia+", Conta "+conta+" e seu saldo "+valor+" J� esta dispon�vel");
		
		sc.close();
	}

}
