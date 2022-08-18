import java.util.Scanner;

public class ex6 {
	public static void main(String [] arg) {
		Scanner sc= new Scanner(System.in);
		String nome;
		int idade;
		String sex;
		int loop=5;
		int idadeBase=0;
		String nomeBase="a";
		String sexBase="a";
		
		do {
			System.out.println("Digite o nome do aluno");
			nome=sc.next();
			
			System.out.println("Digite o sexo do aluno");
			sex=sc.next();
			
			System.out.println("Digite a idade do aluno");
			idade=sc.nextInt();
			
			if(idade>idadeBase) {
				nomeBase=nome;
				idadeBase=idade;
				sexBase=sex;
			}
			
			loop--;
			
		}while(loop!=0);
		
		System.out.println("O aluno "+nomeBase+" do sexo "+sexBase+" e o mais velho com a idade de "+idadeBase);
	}

}
