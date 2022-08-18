import java.util.Scanner;

public class exMatriz {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int linha=0;// ter o mesmo uso q o L tem para o primeiro FOR só q para WHILE
		int coluna=0;//// ter o mesmo uso q o C tem para o seugndo FOR só q para WHILE
		
		
		int matriz1 [][]= new int [2][2];//Criar uma matriz e informar a quantidade de linhas e colunas nela, com o primeiro [] sendo as linhas e o segundo [] sendo as colunas
		
		
		//FORMA DE MANUALMENTE FORCENER OS VALORES DOS INDICES/ não recomendavel dependendo da tarefa
		
		
		matriz1[0][0]=1;
		matriz1[0][1]=2;
		matriz1[1][0]=3;
		matriz1[1][1]=4;
		
		
		//Pode criar uma matriz com 2 linhas só q 1 delas tem 3 colunas e a outra 2 colunas
		//exemplo:
		
		
		//int matriz1 [][]= new int [2][];// O segundo [] é vazio pois vamos dar a quantidade de colunas para as linhas
		//matriz1[0]=new int [3];
		//matriz1[1]=new int [2];
		
		
		//Pode criar tambem dar a quantidade de linhas e colunas de uma matriz com o valor de outras variaveis do tipo Int
		//exmplo:
		//int matriz1[][];
		//System.out.println("De a quantidade de linhas: ");
		//int A=sc.nextInt();
		//System.out.println("De a quantidade de colunas: ");
		//int B=sc.nextInt();
		//matriz1= new int[A][B];
		
		
		int matriz2[][] = {{5,6},{7,8}};//Criar uma matriz e já fornecer os valores dentro dela/  Se cria um {} q significa a matriz inteira, e dentro dela se cria outros {} para representar as linhas e colunas
		// no exemplo de cima é uma matriz 2 por 2 sendo: 5   6 
		//                                                7   8
		
		
		int matriz3[][]= new int [2][3];// matriz q usaremos para fornecer os valores dentro dela
		
		
		//usando FOR
		
		
		//PARA DARMOS VALORES DENTRO DA MATRIZ
		
		for(int L=0;L<matriz3.length;L++) {//O primeiro FOR representa as linha pois "matriz1.length" quer dizer as quantidades de linhas na matriz no caso são 2
			
			for(int C=0;C<matriz3[L].length;C++) {//O segundo FOR representa as colunas pois "matriz1[L].length" quer dizer as quantidade de colunas dentro da linha L, no caso a linha 0 tem 3 colunas e o mesmo vai para linha 1 
				
				System.out.println("De o valor da posição na linha "+L+" e na coluna "+C+":");//dar os valores dos indices da matriz
				
				matriz3[L][C]=sc.nextInt();// [L][C] pois conforme o L e C forem aumentando tambem o numero do indice, no caso vai começar matriz3[0][0] depois matriz3[0][1] depois matriz3[0][2] depois matriz3[1][0] depois matriz3[1][1] e matriz3[1][2]
				
			}
			
		}
		
		
		//IMPRIMIR OS VALORES DE UMA MATRIZ
		
		
		for(int L=0;L<matriz3.length;L++) {
		
			for(int C=0;C<matriz3[L].length;C++) {
				
				System.out.print(matriz3[L][C]+"\t");// Se usa "print" inves de "println" pois qremos  imprimir os valores das colunas na mesma linha, o \t quer dizer q ele ira dar um espaço entre as palavras
				
			}
			
			System.out.println();//Para poder pular uma linha e conseguir escrever as colunas da proxima linha 
		
		}
		
		
		//usando WHILE
		
		
		
		//PARA DARMOS VALORES DENTRO DA MATRIZ
		
		
//		while (linha<matriz3.length) {
//			
//			while(coluna<matriz3[linha].length) {
//				
//				System.out.println("De o valor da posição na linha "+linha+" e na coluna "+coluna+":");
//				
//				matriz3[linha][coluna]=sc.nextInt();
//				
//				coluna++;// aumentar o valor da coluna até chegar a mesma quantidade de colunas da linhas, no caso 3
//			}
//			
//			coluna=0;//resetar o valor da coluna para podermos usala no segundo while de novo
//			
//			linha++;// aumentar o valor da linha até chegar a mesma quantidade linhas da matriz, no caso 2
//		}
//		
//		
//		linha=0;
//		coluna=0;//resetar o valor das duas variaveis para podermos usa-las no proximo while
//		
//		
//		//IMPRIMIR OS VALORES DE UMA MATRIZ
//		
//		while (linha<matriz3.length) {
//			
//			while(coluna<matriz3[linha].length) {
//				
//				System.out.print(matriz3[linha][coluna]+"\t");
//				
//				coluna++;
//			}
//			
//			System.out.println();
//			
//			coluna=0;
//			linha++;
//		}

	}

}
