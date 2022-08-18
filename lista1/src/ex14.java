/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author black
 */
public class ex14 {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
	   System.out.println("Digite o primeiro numero:  ");
	   float n1= sc.nextFloat();
	   System.out.println("Digite o segundo numero:  ");
	   float n2= sc.nextFloat();
	   float resultado;
	   if(n1>n2){
	       resultado = n1/n2;
	        System.out.println("O valor da divisao e: "+resultado);
	    }
	    else {
	        resultado = n2/n1;
	        System.out.println("O valor da divisao e: "+resultado);
	    }
	}
}
