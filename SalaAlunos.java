/*(Utilize o WHILE) Fa�a um programa que pergunte ao usu�rio quantos alunos tem na sala dele.
Em seguida, atrav�s de um la�o, pede ao usu�rio para que entre com as notas de todos os alunos da sala, um por vez.
Por fim, o programa deve mostrar a m�dia aritm�tica, da turma.*/

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