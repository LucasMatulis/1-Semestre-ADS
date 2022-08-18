package ADO2;

import java.util.Scanner;

public class ADO2_LucasMatulis_ex2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("De o valor de um numero: ");
		int n1=sc.nextInt();
		
		for(int i=0;i<3;i++) {
			System.out.println("O "+(i+1)+"° multiplo é: "+n1*(i+1));
		}

	}

}
