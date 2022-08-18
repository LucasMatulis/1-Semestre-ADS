
public class P2Ex3 {

	public static void main(String[] args) {
		
		int contador=0;
		
		 int vetor[]= {3,25,1,58,97,43,65,32,27,19,10,6,88,13,34,57,89,87};
		 
		 int matriz[][]= new int [3][6];
		 
		 
		 for(int i=0;i<matriz.length;i++) {
			 
			 for(int j=0;j<matriz[i].length;j++) {
				 
				 matriz[i][j]=vetor[contador];
				 contador++;
				 
			 }
			 
		 }
		 
		 for(int i=0;i<matriz.length;i++) {
			 
			 for(int j=0;j<matriz[i].length;j++) {
				 
				 System.out.print(matriz[i][j]+"\t");
				 
			 }
			 
			 System.out.println();
			 
		 }

	}


}
