package lista3;

import java.util.Scanner;

public class ex1 {
	
	 static int menor(int a, int b, int c) {
		 
		 
		int menor = a;
		
		if(menor>b && c>b) {
			menor=b;
		}
		else if (menor>c) {
			menor=c;
		}
		 
		return(menor);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("De o primeiro numero");
		int n1=sc.nextInt();
		System.out.println("De o segundo numero");
		int n2=sc.nextInt();
		System.out.println("De o terceiro numero");
		int n3=sc.nextInt();
		System.out.println("O menor numero é: "+(menor(n1, n2, n3)));

	}

}
