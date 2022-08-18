import java.util.Scanner;

public class ex_2d {
	static Scanner sc =new Scanner(System.in);
	
	static void qtd(int m[][]) {
		
		int i=0;
		int j=0;
		
		System.out.println("De um numero: ");
		int n= sc.nextInt();
		
		int qtd=0;
				
		for( i=0; i<m.length;i++) {
			
			for( j=0; j<m[i].length;j++) {
				
				if(n==m[i][j]) {
					
					qtd++;
					System.out.println("Mesmo numero encontrado na posicao: "+i+"-"+j);
					
				}
				
			}
			
		}
		
		if(qtd==0) {
			
			i=100;
			j=100;
			
			System.out.println("Linhas: "+i+ "\tColunas: "+j);
		}
			
			System.out.println("A quantidade de vezes que este numero é encontrado é :"+qtd);
			
	}
	

	public static void main(String[] args) {
		
		int matriz[][]= {{1,2,3},{4,5,6},{1,8,9}};

		qtd(matriz);
		
	}

}
