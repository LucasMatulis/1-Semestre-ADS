package ADO4;

import java.util.Scanner;

public class ADO4_LucasMatulis_ex2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Para que serve import no java?");
		System.out.println("A) Fazer o sistema escrever algo no console");
		System.out.println("B) Mostrar um painel com algo escrito na tela");
		System.out.println("C) Conceder acesso para alguma funcao da biblioteca java");
		System.out.println("D) Guardar variaveis numericas");
		System.out.println("E) Conseguir escanear o que é digitado no teclado");
		char resposta = sc.next().charAt(0);
		   switch( resposta) {
    case 'A' :
     System.out.println("Resposta errada");
     break;
     
     case 'B' :
     System.out.println("Resposta errada");
     break;
     
     case 'C' :
     System.out.println("Resposta correta");     
     break;
     
     case 'D' :
     System.out.println("Resposta errada");
     break;
     
     case 'E' :
     System.out.println("Resposta errada");
     break;
     
     default :
     System.out.println("Resposta invalida");
		   }

	}

}
