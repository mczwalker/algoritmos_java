/*Imprima os fatoriais de 1 a 10. (Utilize o FOR)*/

import java.util.Scanner;

class Fatorial{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("*** FATORIAL ***");
		
		int fatorial = 1;
        	for (int i = 1; i <= 10; i++) {
               		fatorial = fatorial * i;
            		System.out.println("Fatorial de "+i+ " = " +fatorial);
        		}
	}
}