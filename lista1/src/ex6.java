/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author black
 */
public class ex6 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero:  ");
	   float A= sc.nextFloat();
	   System.out.println("Digite o segundo numero:  ");
	   float B= sc.nextFloat();
	   System.out.println("Digite o terceiro numero:  ");
	   float C= sc.nextFloat();
	   float resultado=(A*C)/2;
	   System.out.println("A area do triangulo é "+resultado);
	   resultado=3.14f*(C*C);
	   System.out.println("A area do ciruculo é "+resultado);
	   resultado=((A+B)*C)/2;
	   System.out.println("A area do trapezio é "+resultado);
	   resultado=B*B;
	   System.out.println("A area do quadrado é "+resultado);
	   resultado=A*B;
	   System.out.println("A area do retangulo é "+resultado);
	   resultado=(A*2)+(B*2);
	   System.out.println("O perimetro do retangulo é "+resultado);
	}
}
