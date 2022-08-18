/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author black
 */
public class ex12 {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
    	   System.out.println("De o lado de um quadrado:  ");
    	   float L= sc.nextFloat();
    	   L*=L;
    	   System.out.println("De o raio de um circulo:  ");
    	   float R= sc.nextFloat();
    	   R=3.14f *(R*R);
    	   if(R>L){
    	       System.out.println("A area do circulo e maior que a do quadrado");
    	   }
    	   else{
    	       System.out.println("A area do quadrado e maior que a do circulo");
    	   }
    	  
	}
}
