import java.util.Scanner;

public class ex11 {
     public static void main(String[] args){
     Scanner sc= new Scanner (System.in); 
     double n=-2;
     double resul=1;
     int loop=0;
     
     System.out.println("De um numero");
     double n2=sc.nextDouble();
     
     while(loop<n2){
    resul += 1/n;
    if(n<0){
    n=(n*-1)+1;
    }
    else{
    n=(n+1)*-1;
    }
    loop++;
    }
     
    System.out.printf("%.2f", resul);
    
    }
     }

