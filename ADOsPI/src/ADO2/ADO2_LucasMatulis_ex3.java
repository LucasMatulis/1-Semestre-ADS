package ADO2;

import java.util.Scanner;

public class ADO2_LucasMatulis_ex3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("De o valor de um numero: ");
		int n1=sc.nextInt();
		
		if(n1<=10 && n1>0) {
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+"x"+n1+"= "+n1*(i+1));
		}
		}
		else {
			System.out.println("Numero invalido");
		}

	}

}
