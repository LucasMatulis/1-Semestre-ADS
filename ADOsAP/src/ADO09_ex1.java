
public class ADO09_ex1 {

	public static void main(String[] args) {
	  int[][] matrix1= {{1,2,3},{4,5,6}};
	  int[][] matrix2= {{7,8,9},{10,11,12}};
	  
	  for (int linha=0; linha<matrix1.length;linha++) {
			
			for(int coluna=0; coluna<matrix1[linha].length;coluna++)
			{
				matrix1[linha][coluna]+=matrix2[linha][coluna];
				
			}
		}
	  
	  
	  for (int linha=0; linha<matrix1.length;linha++) {
			
			for(int coluna=0; coluna<matrix1[linha].length;coluna++)
			{
				System.out.print(matrix1[linha][coluna]+"\t");
				
			}
			System.out.println();
		}
	  
	}

}
