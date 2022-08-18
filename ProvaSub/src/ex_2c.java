import java.util.Scanner;

public class ex_2c {
	static Scanner sc =new Scanner(System.in);
	
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
	

	public static void main(String[] args) {
		
		int matriz[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(prod(matriz));
	
	}

}
