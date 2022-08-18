import java.util.Scanner;

public class ex_2e {
	static Scanner sc =new Scanner(System.in);
	
	static int somaD(int m[][]) {
		
		int soma=0;
		
		
		if(m.length==m[0].length) {
			
			for( int i=0; i<m.length;i++) {
				
				for( int j=0; j<m[i].length;j++) {
					
					if(i==j) {
						
						soma+=m[i][j];
						
					}
					
				}
				
			}
			
			int coluna = m.length - 1;
			for (int linha = 0; linha < m.length; linha++) {
				soma += m[linha][coluna];
				coluna--;
			}
			
		}
	
		return soma;
		
	}
	

	public static void main(String[] args) {
		
		int matriz[][]= {{1,2,3},{4,5,6},{7,8,9}};

		System.out.println(somaD(matriz));

	}

}

