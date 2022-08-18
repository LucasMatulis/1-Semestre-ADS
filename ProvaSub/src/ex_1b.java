import java.util.Scanner;

public class ex_1b {
static Scanner sc =new Scanner(System.in);
	
	static int[][] matriz(int l, int c) {
		
		
	    int matriz[][] = new int [l][c];
	    
	    for(int i=0; i<matriz.length;i++) {
			
			for(int j=0; j<matriz[i].length;j++) {
				System.out.println("Informa o valor da linha "+(i+1)+" e da coluna "+(j+1));
				matriz[i][j]=sc.nextInt();
				
				for (int k = 0; k <= i; k++) {
					
			        for (int b=0; b<j;b++) {
			        	
			            if (matriz[i][j] == matriz[k][b]) {
			            	
			                System.out.println("Número repetido, digite outro:");
			                
			                matriz[i][j]=sc.nextInt();
			            }
			        }
				
			}
			
			}
	}
	    return matriz;
}

	public static void main(String[] args) {
		
		
		System.out.println("De a quantidade de linhas: ");
		int linhas= sc.nextInt();
		
		System.out.println("De a quantidade de colunas: ");
		int colunas= sc.nextInt();
		
		
		int matriz[][] = matriz(linhas, colunas);
		
		
		for(int i=0; i<matriz.length;i++) {
			
			for(int j=0; j<matriz[i].length;j++) {
				
				System.out.print(matriz[i][j]+"\t");
				
			}
			System.out.println();
			
		}
	}
}
