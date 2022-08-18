/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author black
 */
public class ex18 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Digite um numero");
    int n= sc.nextInt();
    int A=0;
    int B=1;
    int resul=0;
    
    if(n<=46){
    for(int i=0;i<n;i++){
    System.out.println(resul);
    resul=A+B;
    B=A;
    A=resul;
    }
    }
    else{
    System.out.println("Numero invalido"); 
    }
}
}
