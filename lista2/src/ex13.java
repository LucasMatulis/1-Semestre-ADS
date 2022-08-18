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
     public static void main(String[] args){
    
     Scanner sc= new Scanner (System.in); 
    
     double base= 1;
     double topo=1;
     int N=1;
     double resul=1;
     
     System.out.println("Digite o numero de sequencias");
     int n = sc.nextInt();
     
     
     for(int i=0; i<n;i++){
       topo*=(N+1);
       base*=(N+2);
       N++;
       resul+= topo/base;
     }
     System.out.printf("%.2f", resul);
     }
}
