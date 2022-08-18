
public class ADO09_ex4 {

	public static void main(String[] args) {
		int matrix1[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int soma=0;
		

		for(int i=0; i<matrix1.length;i++){
		   
		    for(int j=0;j<matrix1[i].length;j++) {
		    	
		    	if(i>j) {
		    		soma+=matrix1[i][j];
		    	}
		    	
		    }
		    
		}
		
		System.out.println("A soma de todos os elementos da matriz abaixo da diagonal principal é: "+soma);

	}

}
