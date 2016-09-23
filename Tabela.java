/*Imprima a seguinte tabela, usando fors encadeados:
1
2 4
3 6 9
4 8 12 16     
n n*2 n*3 .... n*n  */

class Tabela{
	public static void main(String[] args){
		
		System.out.println("*** TABELA ***");
		
		int tab = 1;
        	for (int i = 1; i <= 4; i++) {
        	       		//System.out.println(i);            		
               		for(int j=1; j<=i; j++){           			
               			System.out.print(i*j + " ");          			 
               		}
        		System.out.print("\n");
        		}
	}
}