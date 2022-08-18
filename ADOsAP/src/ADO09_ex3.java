
public class ADO09_ex3 {

	public static void main(String[] args) {
		int matrix1[][]= {{1,2,3},{4,5,6}};
		int soma=0;
		

		for(int i=0; i<matrix1.length;i++){
		   
		    for(int j=0;j<matrix1[i].length;j++) {
		    	soma+=matrix1[i][j];
		    	
		    }
		    
		}
		
		System.out.println("A soma de todos os elementos da matriz é: "+soma);

	}

}
