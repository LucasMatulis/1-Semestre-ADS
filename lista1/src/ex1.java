/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author black
 */
public class ex1 {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
	   System.out.println("Digite o primeiro numero:  ");
	   int n1= sc.nextInt();
	   System.out.println("Digite o segundo numero:  ");
	   int n2= sc.nextInt();
	   int resultado= n1*n2;
	   System.out.println("O resultado é "+resultado);
	}
}
