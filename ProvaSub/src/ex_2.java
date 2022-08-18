import java.util.Scanner;

public class ex_2 {
	
	static Scanner sc =new Scanner(System.in);

	
	
	static int soma(int m[][]) {
		
		int soma=0;
		
		 for(int i=0; i<m.length;i++) {
				
				for(int j=0; j<m[i].length;j++) {
					
					if(m[i][j]%2==0) {
						
						soma+=m[i][j];
						
					}
					
				}
				
			}

		
		
		return soma;
	}
	
	static int prod(int m[][]) {
		
		int prod=1;
		
		 for(int i=0; i<m.length;i++) {
				
				for(int j=0; j<m[i].length;j++) {
					
					if(m[i][j]%2!=0) {
						
						prod*=m[i][j];
						
					}
					
				}
				
			}

		
		
		return prod;
	}
	
	static int somaImpar(int m[][]) {
		
		int soma=0;
		
		for(int i=0; i<m.length;i++) {
			
			for(int j=0; j<m[i].length;j++) {
				
				if(i%2!=0 || j%2!=0) {
					
					soma+=m[i][j];
					
				}
				
			}
			
		}
		
		
		return soma;
	}
	
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
			
			System.out.println("Linha: "+i+ "\tColunas: "+j);
		}
			
			System.out.println("A quantidade de vezes que este numero é encontrado é :"+qtd);
			
	}
	
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
		
		for(int i=0; i< m.length;i++) {
			
			for(int j=0;j<m[i].length;j++) {
				
				vC[i]+=m[j][i];
			}
			
			
			
		}
		
		
		
		return vC;
	}

	
	

	public static void main(String[] args) {
		
		int matriz[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(soma(matriz));
		
		System.out.println(somaImpar(matriz));
		
		System.out.println(prod(matriz));
		
		qtd(matriz);
		
		System.out.println(somaD(matriz));
		
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
