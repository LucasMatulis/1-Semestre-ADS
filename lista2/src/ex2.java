import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Digite um numero");
    int N=sc.nextInt();
    int n=1;
    int resul=0;
    
    while(n<=N){
        resul+=n;
        n++;        
    }
    System.out.println("O resultado da soma de todos os numeros inteiros de 1 a "+N+" e "+resul);
}
}
