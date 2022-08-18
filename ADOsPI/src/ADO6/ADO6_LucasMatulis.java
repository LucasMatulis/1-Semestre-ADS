package ADO6;

import java.util.Scanner;

public class ADO6_LucasMatulis {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int tentativa=0;
		char resposta;
		
		do {
		System.out.println("Para que serve import no java?");
		System.out.println("A) Fazer o sistema escrever algo no console");
		System.out.println("B) Mostrar um painel com algo escrito na tela");
		System.out.println("C) Conceder acesso para alguma funcao da biblioteca java");
		System.out.println("D) Guardar variaveis numericas");
		System.out.println("E) Conseguir escanear o que é digitado no teclado");
		resposta = sc.next().charAt(0);
		   switch( resposta) {
    case 'A' :
     System.out.println("Resposta errada");
     tentativa++;
     break;
     
     case 'B' :
     System.out.println("Resposta errada");
     tentativa++;
     break;
     
     case 'C' :
     System.out.println("Resposta correta na "+(tentativa+1)+"° tentativa");
     tentativa=3;
     break;
     
     case 'D' :
     System.out.println("Resposta errada");
     tentativa++;
     break;
     
     case 'E' :
     System.out.println("Resposta errada");
     tentativa++;
     break;
     
     default :
     System.out.println("Resposta invalida");
		   }
		}while(tentativa!=3);
		
		if(tentativa==3 && resposta!='C') {
			System.out.println("Resposta errada nas 3 tentativas");
		}
		
		

	}

}
