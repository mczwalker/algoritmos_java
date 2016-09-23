/*Faça um programa que calcule e apresente o Índice de Massa Corporal (IMC), 
e apresente a condição de IMC. Para isso, o programa deve solicitar o sexo
 (masculino ou feminino), a altura e o peso. */

import java.util.Scanner;

class CalculoImc{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		char sexo;
		double altura, peso, imc;
		System.out.println("***CALCULO DO IMC");		
		System.out.println("***Digite seu sexo. *'M' para masculino e 'F' para feminino:");
		sexo=entrada.nextLine().charAt(0);
		System.out.println("***Digite sua altura: ");
		altura = entrada.nextDouble();
		System.out.println("***Digite seu peso: ");
		peso = entrada.nextDouble();
	    	
	    	imc = peso/(altura*altura);
	    	System.out.println("***Seu IMC e: "+imc);
	    	
            	if(sexo == 'f' || sexo == 'F'){
            		if(imc < 19.1){
            			System.out.println("Você está abaixo do peso!");
            		}
	            	else if(imc >= 19.1 && imc <25.8){
            			System.out.println("Você está no peso ideal!");
            		}
            		else if(imc >= 25.8 && imc <27.3){
            			System.out.println("Você está um pouco acima do peso!");
            		}
            		else if(imc >= 27.3 && imc <31.1){
            			System.out.println("Você está acima do peso ideal!");
            		}
            		else{
            			System.out.println("Você está obeso!");
            		}
            	}
            	if(sexo == 'm' || sexo == 'M'){
            		if(imc < 20.7){
            			System.out.println("Você está abaixo do peso!");
            		}
            		else if(imc >= 20.7 && imc <26.4){
            			System.out.println("Você está no peso ideal!");
            		}
            		else if(imc >= 26.4 && imc <27.8){
            			System.out.println("Você está um pouco acima do peso!");
            		}
            		else if(imc >= 27.8 && imc <32.3){
            			System.out.println("Você está acima do peso ideal!");
            		}
            		else{
            			System.out.println("Você está obeso!");
            		}
            		
            	
            	}        	
	
	}
}