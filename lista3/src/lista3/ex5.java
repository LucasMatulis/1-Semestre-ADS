package lista3;

import java.util.Scanner;
import java.lang.Math;

public class ex5 {
	
	public static float bhaskaraP(int a, int b , int c) {
		float delta;
		float resul;
		float raiz;
		
		delta= (float) Math.pow(b, 2) -4*a*c;
		raiz = (float)Math.sqrt(delta);
		if(delta%raiz==0 & a!=0) {
			resul=(-b + (float) Math.sqrt(delta))/(2*a);
		}
		else {
			resul=-1;
		}
		
		return((float)resul);
	}
	
	public static float bhaskaraN(int a, int b , int c) {
		float delta;
		float resul=0;
		float raiz;
		
		delta= (float) Math.pow(b, 2) -4*a*c;
		raiz = (float)Math.sqrt(delta);
		if(delta%raiz==0 & a!=0) {
			resul=(-b - (float) Math.sqrt(delta))/(2*a);
		}
		else {
			resul=-1;
		}
		
		return((float)resul);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ax^2 + bx + c = 0");
		System.out.println("De o valor de A");
		int n1=sc.nextInt();
		System.out.println("De o valor de B");
		int n2=sc.nextInt();
		System.out.println("De o valor de C");
		int n3=sc.nextInt();
		System.out.println("O resultado da bhaskara é: "+(bhaskaraP(n1, n2, n3)+" ou " +bhaskaraN(n1, n2, n3)));
	}

}
