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
    public static void main(String[] args) {
	   Scanner sc= new Scanner (System.in);
	   float A=0;
	   float B=0;
	   float C=0;
	   System.out.println("De valor para um dos lado do triangulo:  ");
	   float n1= sc.nextFloat();
	   System.out.println("De valor para um dos lados do triangulo:  ");
	   float n2= sc.nextFloat();
	   System.out.println("De valor para um dos lados do triangulo:  ");
	   float n3= sc.nextFloat();
	   
	   if(n1>=n2 & n1>=n3 & n2>=n3){
	       A=n1;
	       B=n2;
	       C=n3;
	   }
	   else if(n1>=n2 & n1>=n3 & n3>=n2){
	       A=n1;
	       B=n3;
	       C=n2;
	   }
	   else if(n2>=n3 & n2>=n1 & n3>=n1){
	       A=n2;
	       B=n3;
	       C=n1;
	   }
	   else if(n2>=n3 & n2>=n1 & n1>=n3){
	       A=n2;
	       B=n1;
	       C=n3;
	   }
	   else if(n3>=n1 & n3>=n2 & n1>=n2){
	       A=n3;
	       B=n1;
	       C=n2;
	   }
	   else if(n3>n1 & n3>n2 & n2>n1){
	       A=n3;
	       B=n2;
	       C=n1;
	   }
	   
	   
    	       if(A>=B+C){
    	       System.out.println("Nao forma um triangulo");
        	   }
        	   else{
            	   if(A*A==(B*B)+(C*C)){
        	       System.out.println("triangulo retangulo");
            	   }
            	   
            	   if(A*A>(B*B)+(C*C)){
        	       System.out.println("triangulo obtusangulo");
            	   }
            	   
            	   if(A==B && A==C && C==B){
        	       System.out.println("triangulo equilatero");
            	   }
            	   else if(A==B || A==C || C==B){
            	   System.out.println("triangulo isoseles");
            	    }
        	
                   if(A*A<(B*B)+(C*C)){
            	   System.out.println("triangulo acutangulo");
            	    }
        }
        	    
}
}
