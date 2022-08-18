/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author black
 */
public class ex8 {
    	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
	   System.out.println("Digite o primeiro numero:  ");
	   int n1= sc.nextInt();
	   System.out.println("Digite o segundo numero:  ");
	   int n2= sc.nextInt();
	   System.out.println("Digite o terceiro numero:  ");
	   int n3= sc.nextInt();
	   System.out.println("Digite o quarto numero:  ");
	   int n4= sc.nextInt();
	   int resultado= (n1+n2+n3+n4)/4;
	   System.out.println("A media aritimetica é "+resultado);
	}
}
