package ADO10;
import java.util.Random;
import java.util.Scanner;

public class ADO10_LucasMatulis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random = new Random();
		int n=new Random().nextInt(7)+1;
		int T=0;
		int r;
		
		System.out.println(n);
		
		do {
			System.out.println("Digite um numero");
			r=sc.nextInt();
			
			if(r==n) {
				System.out.println("Parabéns, você ganhou o jogo!");
				break;
			}
			
			if(r==n-1 || r==n+1) {
				System.out.println("QUENTE!");
			}
			else if(r>n) {
				System.out.println("Numero maior que o numero que o numero chave");
			}
			else if(r<n) {
				System.out.println("Numero menor que o numero que o numero chave");
			}
			
			
			T++;
		}while(T!=5);
		
		if(T==5) {
		System.out.println("Game Over");
		}

	}

}
