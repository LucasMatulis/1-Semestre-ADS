/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author black
 */
public class ex7 {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
	   System.out.println("De um valor para A:  ");
	   float A= sc.nextFloat();
	   System.out.println("De um valor para B:  ");
	   float B= sc.nextFloat();
	   float resultado= (A*A)+(B*B);
	   System.out.println("A hipotenusa do triangulo e "+Math.sqrt(resultado));
	}
}
