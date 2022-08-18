/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author black
 */
public class ex17 {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
	   System.out.println("De um valor para A:  ");
	   int A= sc.nextInt();
	   int par= A%2;
	   System.out.println("De um valor para B:  ");
	   int B= sc.nextInt();
	   System.out.println("De um valor para C:  ");
	   int C= sc.nextInt();
	   System.out.println("De um valor para D:  ");
	   int D= sc.nextInt();
	   if(B>C && D>A && C+D>A+B && C>0 && D>0 && par==0){
	       System.out.println("Valores aceitos");
	   }
	   else{
	       System.out.println("Valores não aceitos");
	   }
	}
}
