/*(Utilize o WHILE) Fa�a um programa que apresenta os n�meros primos de 1 at� 100.
OBS.: um n�mero � primo quando possui apenas dois divisores: o 1 e ele mesmo.*/

class NumerosPrimos{
	public static void main(String[] args){				
		double i = 1;
		int contador=0;
		
		
		while(i<=100){			
			for(double j=i; j>=1; j--){
								
				if(i%(j-1)==0){ 
					contador++;
				}
				else{
				}
			}
		if(contador==1){
			System.out.println("Primos: " +i);
		}
		
		contador = 0;
		i++;	
		}
	}
}