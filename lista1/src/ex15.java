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
public class ex15 {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
	   System.out.println("De o valor para A:  ");
	   float A= sc.nextFloat();
	   System.out.println("De o valor para B:  ");
	   float B= sc.nextFloat();
	   System.out.println("De o valor para C:  ");
	   float C= sc.nextFloat();
	   float base=A*2;
	   float raiz=(B*B)-4*A*C;
	   if(base==0 || raiz<0){
	       System.out.println("Impossivel calcular");
	   }
	   else{
	       double resulA= ((B*-1)+Math.sqrt(raiz) )/base;
	       double resulB= ((B*-1)-Math.sqrt(raiz) )/base;
	       System.out.println("o resultado da equaçao de bhaskara é: "+resulA+" ou "+resulB);
	   }
	}
}
