/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author black
 */
public class ex15 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Digite um numero");
    int loop= sc.nextInt();
    int negativo=0;
    int n=loop;
    int n2=loop;
    
    if(loop>0){
    for(int i=1; i<loop-1; i++){
    n*=(n2-i);
    }
    System.out.println("O fatorial e "+n);
    }
    else{
    System.out.println("Numero invalido");
    }
}
}
