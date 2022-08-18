import java.util.Scanner;

public class ExercicioFOR {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float vetor[]= new float [4];
		
		for(int i=0; i<vetor.length;i++) {
			
			System.out.println("De a nota do aluno "+(i+1));
			vetor[i]=sc.nextFloat();
			
		}
		
		for(int i=0; i<vetor.length;i++) {
			
			System.out.println("A nota do aluno "+(i+1)+" é: "+vetor[i]);
			
		}
		

	}

}
