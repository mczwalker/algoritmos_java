/*(Utilize o WHILE) Faça um programa que pergunte ao usuário quantos alunos tem na sala dele.
Em seguida, através de um laço, pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.
Por fim, o programa deve mostrar a média aritmética, da turma.*/

import java.util.Scanner;

class SalaAlunos{
	public static void main(String[] args){
		Scanner entrada  = new Scanner(System.in);
		int qtdAlunos;
		int i = 1;
		double nota = 0;
		System.out.println("Quantos alunos existem na sua sala de aula?");
			qtdAlunos = entrada.nextInt();
			
			while(i<=qtdAlunos){
				System.out.println("Digite a nota do aluno " +i+ ":" );
				nota = entrada.nextDouble()+nota;
				
			i++;	
			}
			System.out.println("Media de notas: "+nota/qtdAlunos);
		
	}


}