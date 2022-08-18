/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author black
 */
public class ex13 {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
	   System.out.println("Digite o primeiro numero:  ");
	   float n1= sc.nextFloat();
	   System.out.println("Digite o segundo numero:  ");
	   float n2= sc.nextFloat();
	   System.out.println("Digite o terceiro numero:  ");
	   float n3= sc.nextFloat();
	    if(n1>n2 && n1>n3){
	        System.out.println("O numero maior é: "+n1);
	    }
	    else if(n2>n1 && n2>n3){
	        System.out.println("O numero maior é: "+n2);
	    }
	    else if(n3>n2 && n3>n1){
	        System.out.println("O numero maior é: "+n3);
	    }
	}
}
