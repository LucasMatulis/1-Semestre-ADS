package lista3;
import java.util.Scanner;
public class ex2 {
	
	
	public static int somatoria(int n) {
		int soma=0;
		
		for(int i=0; i<n;i++) {
		soma+=n-i;	
		}
		
		return(soma);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("De um numero");
		int n1=sc.nextInt();
		if(n1>=0) {	
		System.out.println("O valor da soma é: "+(somatoria(n1)));
		
		}
		else {
			System.out.println("Numero invalido");
			
		}
	}
}
