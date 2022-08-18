import java.util.Scanner;

public class ex16 {
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
    System.out.println("Digite a quantidade de numeros");
    int qtd=sc.nextInt();
    
    do{
    
    System.out.println("Digite um numero");
    int n= sc.nextInt();
    
    if(n<0){
    System.out.println("NEGATIVO");
    }
    else{
    System.out.println("POSITIVO");
    }
    
    if(n%2==0){
    System.out.println("PAR");
    }
    else{
    System.out.println("IMPAR");
    }
    
    if(n==0){
    System.out.println("NULO");
    }
    
    qtd--;
    
    }while(qtd!=0);
    }
}
