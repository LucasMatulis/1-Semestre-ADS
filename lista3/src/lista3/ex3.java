package lista3;
import java.util.Scanner;
public class ex3 {

	public static int fatorial(int a) {
		int fat=1;
		
		for(int i=0; i<a;i++) {
		fat*=a-i;	
		}
		
		return(fat);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("De um numero");
		int n1=sc.nextInt();
		if(n1>=0) {	
			System.out.println("O fatorial é: "+(fatorial(n1)));
			
			}
			else {
				System.out.println("Numero invalido");
				
			}

	}

}
