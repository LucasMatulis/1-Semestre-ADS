import java.util.Scanner;

public class ex3 {
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
        int n=0;
    for(int i=1;i<11;i++){
    System.out.println("Digite um numero");
    int n2= sc.nextInt();
    if(n2>n){
    n=n2;
    }
    }
    System.out.println("O maior numero é "+n);
    }
}
