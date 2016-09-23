/*Faça um programa que de acordo recebe as notas obtidas nos quatro bimestres, 
calcula a média final, e apresenta a classificação do aluno de acordo com os critérios abaixo para a média final:
0.0 - 4.0 : Insuficiente
4.1 - 5.9 : Ruim
6.0 - 7.9 : Regular
8.0 - 10.0 : Bom*/

import java.util.Scanner;

class Notas{
	public static void main(String[] args){
		Scanner entrada =  new Scanner(System.in);
		double bimestre1, bimestre2, bimestre3, bimestre4, mediaFinal;
		System.out.println("***Digite as notas***");		
		System.out.println("1 Bimestre: ");
		bimestre1 = entrada.nextDouble();
		System.out.println("2 Bimestre: ");
		bimestre2 = entrada.nextDouble();
		System.out.println("3 Bimestre: ");
		bimestre3 = entrada.nextDouble();
		System.out.println("4 Bimestre: ");
		bimestre4 = entrada.nextDouble();
		
		mediaFinal = (bimestre1+bimestre2+bimestre3+bimestre4)/4;
		System.out.println("MEDIA FINAL: "+mediaFinal);
		
		if(mediaFinal>=0.0 && mediaFinal<=4.0){
			System.out.println("Media Insuficiente");
		}
		else if(mediaFinal>=4.1 && mediaFinal<=5.9){
			System.out.println("Media Ruim");
		}
		else if(mediaFinal>=6.0 && mediaFinal<=7.9){
			System.out.println("Media Regular");
		}
		else if(mediaFinal>=8.0 && mediaFinal<=10.0){
			System.out.println("Media Regular");
		}
	}
}