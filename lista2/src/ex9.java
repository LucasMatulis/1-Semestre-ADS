import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int alunos=0;
		float media=0;
		float nota=0;
		float notaTtl=0;
		System.out.println("De a quantidade de alunos");
		alunos=sc.nextInt();
		
		for(int i=0; i<alunos; i++) {
			
			System.out.println("De a nota do aluno");
			nota=sc.nextFloat();
			notaTtl+=nota;
			media++;
		}
		System.out.println("A media das notas de todos os alunos � "+(notaTtl/media));
	}
}
