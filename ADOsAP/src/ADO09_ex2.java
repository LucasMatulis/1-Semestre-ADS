
public class ADO09_ex2 {

	public static void main(String[] args) {
		System.out.println("MATRIZ INICIAL");
		int[][] m1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		for(int i=0; i<m1.length;i++){
		   
		    for(int j=0;j<m1[i].length;j++) {
		    System.out.print(m1[i][j]+"\t");
		    }
		    System.out.println();
		    
		}
		System.out.print("\nMATRIZ TRANSPOSTA\n");
		for(int i=0; i<3;i++){

		    for(int j=0;j<3;j++){
		    System.out.print(m1[j][i]+"\t");
		    }
		    System.out.println();
	
		}

	}

}
