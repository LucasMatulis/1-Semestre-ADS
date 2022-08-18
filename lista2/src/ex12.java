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
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
     double n2= 1;
     int negativo=0;
     double resul=0;
     
     System.out.println("Digite um numero");
     int n = sc.nextInt();
     System.out.println("Quantas vezes voce quer fazer a soma?");
     int loop=sc.nextInt();
     
     
    for(int i=0; i<loop;i++){
       resul+= n2/(n-negativo);
       negativo++;
       n2++;
       
    }
     
     System.out.println(resul);
    }
}
