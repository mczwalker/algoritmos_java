//Quest�o 4: Fa�a um programa que de acordo com o sexo da pessoa (M-Masculino e F- Feminino) retorna uma mensagem informando se o sexo � valido ou n�o.
//OBS.: obrigat�rio o uso de um operador l�gico.

import java.util.Scanner;


class VerificaSexo{
	public static void main(String args[]) {
           
            Scanner entrada = new Scanner(System.in);
                        
            System.out.println("***Digite F para Feminino ou M para Masculino:");        
            
	   char sexo=entrada.nextLine().charAt(0); 
            
	    System.out.println("Valor:" +sexo);
            	if(sexo == 'm' || sexo == 'M' || sexo == 'f' || sexo == 'F'){
            		System.out.println("Sexo OK!");
            	}
            	else{
            		System.out.println("Sexo invalido");
            	}
            	
           }
}