import java.util.Scanner;

public class P2Ex1 {

static Scanner sc =new Scanner(System.in);
	
	static void matriz(int L, int C) {
		
		
		int matriz[][]= new int  [L][C];
		
		for(int i=0; i<matriz.length;i++) {
			
			for(int j=0; j<matriz[i].length;j++) {
				
				System.out.println("Informa o valor da linha "+(i+1)+" e da coluna "+(j+1));
				matriz[i][j]=sc.nextInt();
				
			}
			
		}
		
		for(int i=0; i<matriz.length;i++) {
			
			for(int j=0; j<matriz[i].length;j++) {
				
				System.out.print(matriz[i][j]+"\t");
				
			}
			System.out.println();
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {

		
		System.out.println("Informa o numero de linhas da matriz: ");
		int Linha=sc.nextInt();
		System.out.println("Informa o numero de colunas da matriz: ");
		int Coluna=sc.nextInt();
		
		matriz(Linha,Coluna);


		

	}


}
