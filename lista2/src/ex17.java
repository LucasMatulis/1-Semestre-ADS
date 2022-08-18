/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author black
 */
public class ex17 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Digite um numero");
    int n=sc.nextInt();
    
    System.out.println("Os divisores comuns são:");
    
    for(int i=1; i<n+1;i++){
    
     if(n%i==0){
    System.out.println(i);
    }
     
    }
    
    }
}
