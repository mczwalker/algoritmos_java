/*Um terminal de um banco precisa de um terminal que o usu�rio efetue as seguintes opera��es: 1-Consulta saldo, 2-Dep�sito, 3- Saque, 4. Sair.

Regras: 
* ao iniciar o programa, antes mesmo de aparecer as op��es, deve atribuir ao saldo o valor de 100,00 reais.
* se escolher op��o 1, apenas apresentar o saldo.
* se escolher a op��o 2, solicitar o valor a ser depositado, e informar o novo saldo.
* se escolher a op��o 3, verificar se o valor do saque � maior do que o valor em conta. Se for, informar que n�o � permitido, caso contr�rio, efetuar o saque.
* se escolher a op��o 4, sair do programa.
* se digitar um n�mero fora desse intervalo, informar que o n�mero � inv�lido.*/

import java.util.Scanner;

class TerminalBanco{
	public static void main(String[] args){
		double saldo = 100.00;
		int opcao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("***TERMINAL BANCARIO ***");
		System.out.println("* Pressione 1 para apresentar o saldo.");
		System.out.println("* Pressione 2 para depositar.");
		System.out.println("* Pressione 3 para sacar.");
		System.out.println("* Pressione 4 para sair.");
		
		opcao = entrada.nextInt();
		
		
		while(opcao<1 || opcao>4){
			System.out.println("Op��o inv�lida! Digite novamente sua op��o: ");
			opcao = entrada.nextInt();
		}
				

		
		switch(opcao){
			case 1:
				System.out.print("Saldo atual: "+saldo);
				break;
			case 2:
				System.out.print("Digite o valor a ser depositado: ");
				double valorDeposito;
				valorDeposito = entrada.nextInt();
				saldo = saldo + valorDeposito;
				System.out.print("Dep�sito efetuado com sucesso! Saldo atual: "+saldo);
				break;
			case 3:
				System.out.print("Digite o valor a ser sacado: ");
				double valorSaque= entrada.nextDouble();
				if(valorSaque > saldo){
					System.out.println("Saldo insuficiente! Refa�a a opera��o.");
					break;
				}
				else{
				saldo = saldo - valorSaque;
				System.out.print("Saque efetuado com sucesso! Saldo atual: "+saldo);
				}
				break;
			case 4:
				System.out.print("Sess�o encerrada!");
				break;
			
		}
		
	}


}