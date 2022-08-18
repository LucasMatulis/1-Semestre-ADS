import java.util.Scanner;

public class ex_2f {
	static Scanner sc =new Scanner(System.in);
	
	static int[] vetorL(int m[][]) {
		
		int vL[]= new int [m.length];
		
		for(int i=0; i<m.length; i++) {
			
			for (int j =0; j<m[i].length;j++) {
				
				vL[i]+=m[i][j];
				
			}
			
			
		}
		
		
		
		return vL;
	}
	
	static int[] vetorC(int m[][]) {
		
		int vC[]= new int [m[0].length];
		
		for(int i=0; i<m[0].length; i++) {
			
			for (int j =0; j<m.length;j++) {
				
				vC[i]+=m[j][i];
				
			}
			
			
		}
		
		
		
		return vC;
	}

	
	

	public static void main(String[] args) {
		
		int matriz[][]= {{1,2,3,1},{4,5,6,1},{7,8,9,1}};
		
		System.out.println("Vetor da linha: \t");
		
		for(int i=0; i< vetorL(matriz).length;i++) {
			
			System.out.print(vetorL(matriz)[i]+"\t");
			
		}
		System.out.println();
		
		System.out.println("Vetor da Coluna: \t");
		
		for(int i=0; i< vetorC(matriz).length;i++) {
			
			System.out.print(vetorC(matriz)[i]+"\t");
			
		}

	}

}
