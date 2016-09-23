import java.util.Scanner;

class Adivinhacao{
	public static void main(String args[]) {
            int numeroSecreto = 55;
            int opcao=0;
            int qtdChutes=0;
            int chute=0;
            int tentativas=0;
            int erros=0;
            Scanner entrada = new Scanner(System.in);
                        
            System.out.println("***JOGO ADIVINHAÇÃO:");
            System.out.println("Nivel do jogo:");
            System.out.println("1 - Nivel - 3 tentativas");
            System.out.println("2 - Nivel - 5 tentativas");
            System.out.println("3 - Nivel - 8 tentativas");
            System.out.println("Digite a sua opção: ");            
            opcao = entrada.nextInt();
            
            while(opcao<1 || opcao>3){
            	System.out.println("Nível inválido, por favor digite a sua opção novamente 1, 2 ou 3:");
            	opcao = entrada.nextInt();
            }
            
            switch(opcao){
                case 1:
                    System.out.println("***Escolhido 3 tentativas!***");
                    qtdChutes = 3;
                    break;
                case 2:
                    System.out.println("***Escolhido 5 tentativas!***");
                    qtdChutes = 5;
                    break;
                case 3:
                    System.out.println("***Escolhido 8 tentativas!***");
                    qtdChutes = 8;
                    break;              
                
            }
            
            for(int i = 1; i<=qtdChutes; i++){
                System.out.println("Digite seu chute: ");
                tentativas++;
                chute = entrada.nextInt();
                if(chute == numeroSecreto){
                    System.out.println("Acertou na "+tentativas+" tentativa!");
                    break;
                }
                else if(chute < numeroSecreto){
                    System.out.println("Errou. Numero menor");
                    erros++;
                }
                else if(chute > numeroSecreto){
                    System.out.println("Errou. Numero maior");
                    erros++;
                }
            }
            if(erros==qtdChutes){
            	System.out.println("Você não acertou nenhum chute!");
            }
            else{
            }
                     
        }
}