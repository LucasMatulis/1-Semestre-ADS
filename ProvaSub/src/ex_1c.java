
public class ex_1c {
	
	static void print(int m[][]) {
		
		
		for(int i=0; i<m.length;i++) {
			
			for(int j=0; j<m[i].length;j++) {
				
				System.out.print(m[i][j]+"\t");
				
			}
			System.out.println();
			
		}
		
		
	}

	public static void main(String[] args) {
		
		
		int[][] matriz= {{1,2,3,4,5},{5,7,8,9,10}};
		
		print(matriz);

	}

}
