import java.util.Scanner;

public class ex19 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int senha=2002;
    boolean certo=false;
    
    do{
    System.out.println("Digite a senha: ");
    int tenta= sc.nextInt();
    
    if(tenta==senha){
    certo=true;
    System.out.println("Acesso Permitido");
    }
    else{
    System.out.println("Senha Invalida");
    }
    
    }while(!certo);
    
    }
}
