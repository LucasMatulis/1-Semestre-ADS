import java.util.Scanner;

public class ex_1a {
	
static Scanner sc =new Scanner(System.in);
	
	static int[][] matriz() {
	    
	    System.out.println("De a quantidade de linhas: ");
		int l= sc.nextInt();
		
		System.out.println("De a quantidade de colunas: ");
		int c= sc.nextInt();
		
		int matriz[][] = new int [l][c];

	 
	    return matriz;
	}
	
	static void aaaa() {
		
		 	System.out.println("De a quantidade de linhas: ");
			int l= sc.nextInt();
			
			System.out.println("De a quantidade de colunas: ");
			int c= sc.nextInt();
		
			int matriz[][] = new int [l][c];
			
			System.out.println("Linha: "+matriz.length);
			System.out.println("Coluna: "+matriz[0].length);
		
	}

	public static void main(String[] args) {
		
		
		int matriz[][] = matriz();
		
		System.out.println("Linha: "+matriz.length);
		System.out.println("Coluna: "+matriz[0].length);
		
		aaaa();
		
		
		
	}
}
