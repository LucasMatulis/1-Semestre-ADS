package ADO5;

import java.util.Scanner;

public class ADO5_LucasMatulis {
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int opcao=0;
	    System.out.println("Bem vindo!!!");
	    do{
		System.out.println("1- Instruções");
		System.out.println("2- Jogar");
		System.out.println("3- Créditos");
		System.out.println("4- Sair");
		opcao = sc.nextInt();
			
			switch(opcao){
		        case 1 :
		        System.out.println("Pule, corra e se divirta");
		        break;
		        
		        case 2 :
		        System.out.println("Jogo iniciado");
		        break;
		        
		        case 3 :
		        System.out.println("Lucas Matulis");
		        break;
		        
		        case 4 :
		        System.out.println("Adeus!!");
		        break;
		        default:
		        System.out.println("Numero invalido");
		}
	    }while(opcao!=4);
		
	}
}
