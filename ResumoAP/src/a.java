import java.util.Scanner;

public class a {
	
	public static void main (String args[]){
		
		Scanner sc= new Scanner(System.in);
		
		
		int Altair[][]= new int [4][5];
		
		
		for(int i=0; i<Altair.length;i++) {
			
			for(int j=0; j<Altair[i].length;j++) {
				
				System.out.println("De o valor da linha "+i+" e da coluna "+j);
				Altair[i][j]=sc.nextInt();
				
			}
		}
		
		for(int i=0; i<Altair.length;i++) {
			
			for(int j=0; j<Altair[i].length;j++) {
				
				System.out.print(Altair[i][j]+"\t");
				
			}
			
			System.out.println();
		}
		
		

}
}
