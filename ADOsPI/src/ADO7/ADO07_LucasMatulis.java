package ADO7;

import java.util.Scanner;

public class ADO07_LucasMatulis {

	public static void main(String[] args) {
		String alternativa;

        int erros = 0;
        int count = 3;

        do {

            if (count == 3) {
                System.out.printf("Para que serve import no java? (Você tem %d tentativas)\nA) Conseguir escanear o que é digitado no teclado.\nB) Guardar variaveis numericas.\nC) Fazer o sistema escrever algo no console.\nD) Conceder acesso para alguma funcao da biblioteca java.\nE) Mostrar um painel com algo escrito na tela.\n", count);
            }

            if (count == 2) {
                System.out.printf("Para que serve import no java? (Você tem %d tentativas)\nA) Guardar variaveis numericas.\nB) Conseguir escanear o que é digitado no teclado.\nC) Mostrar um painel com algo escrito na tela.\nD) Fazer o sistema escrever algo no console.\nE)  Conceder acesso para alguma funcao da biblioteca java.\n", count);
            }

            if (count == 1) {
                System.out.printf("Para que serve import no java? (Você tem %d tentativas)\nA) Conceder acesso para alguma funcao da biblioteca java\nB) Mostrar um painel com algo escrito na tela\nC) Fazer o sistema escrever algo no console\nD) Guardar variaveis numericas\nE) Conseguir escanear o que é digitado no teclado\n", count);
            }
            Scanner sc = new Scanner(System.in);
            alternativa = sc.next();


            switch (count) {
                case 3:
                    switch (alternativa) {
                        case "D":
                        case "d":

                            System.out.println("Sua resposta está correta!");
                            count = 0;
                            break;
                        default:
                            System.out.println("Sua resposta está incorreta!");
                            count--;
                            erros++;
                        }
                    break;

                case 2:
                    switch (alternativa) {
                        case "E":
                        case "e":

                            System.out.println("Sua resposta está correta!");
                            count = 0;
                            break;
                        default:
                            System.out.println("Sua resposta está incorreta!");
                            count--;
                            erros++;
                    }
                    break;
                case 1:
                    switch (alternativa) {
                        case "A":
                        case "a":

                            System.out.println("Sua resposta está correta!");
                            count = 0;
                            break;
                        default:
                            System.out.println("Sua resposta está incorreta!");
                            count--;
                            erros++;
                        }
                    break;
            }
        } while (count != 0) ;

        if (erros == 3) {
                System.out.println("Resposta incorreta nas 3 tentativas");
        }

	}

}
