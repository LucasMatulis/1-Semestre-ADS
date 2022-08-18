
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class a {
	   public static int[] vetorM(int[] x){
	        Random gerador = new Random();

	        for(int i=0; i < x.length; i++) {
	            x[i] = gerador.nextInt((25));
	        }

	        return x;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a quantidade de linhas da matriz: ");
	        int n = scanner.nextInt();

	        System.out.print("Digite a quantidade de colunas da matriz: ");
	        int m = scanner.nextInt();

	        int[] vetorM = new int[m];
	        System.out.println("Vetor = " + Arrays.toString(vetorM(vetorM))); //vetor com números aleatórios

	        int[][] matriz = new int[n][m];

	        for (int l = 0; l < matriz.length; l++) { //pega as linhas da matriz
	            for (int c = 0; c < matriz[l].length; c++) { //pega a quantidade de colunas da matriz
	                matriz[l][c] = vetorM[c];//pega os elemento do vetor e junta com a quantidade de colunas presentes na matriz
	            }
	        }

	        for (int l = 0; l < matriz.length; l++) { //repete o processo porém a sua única função vai ser imprimir
	            for (int c = 0; c < matriz[l].length; c++) { //a matriz ja finalizada
	                System.out.print(matriz[l][c] + "\t"); // "\t" sem "println" para ficar no formato tradicional de matriz
	            }
	            System.out.println();//dar o espaço entra cada linha
	                                 // 2    3   4   6
	                                 // 3    4   5   8
	        }
	    }
}
