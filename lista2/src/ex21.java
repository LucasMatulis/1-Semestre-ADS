/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author black
 */
public class ex21 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Digite um numero");
    int N=sc.nextInt();
    int NP=0;
    
    for(int i=1; i<N;i++){
    
     if(N%i==0){
      NP+=i;
      System.out.println(NP);
    }
    
    }
    
    if(NP==N){
    System.out.println("O numero e perfeito");
    }
    else{
    System.out.println("O numero nao e perfeito");
    }
}
}
