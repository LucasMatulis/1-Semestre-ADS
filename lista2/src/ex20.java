import java.util.Scanner;

public class ex20 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int opcao=0;
    float dinheiro=0;
    
    System.out.println("Digite o seu saldo atual");
    float saldo=sc.nextFloat();
    do{
    System.out.println("Escolha a um opcao \nDEPOSITO[1] \nSAQUE[2] \nSAIR[3]");
    opcao=sc.nextInt();
    
    switch(opcao){
    case 1:
            System.out.println("Quanto voce quer depositar");
            dinheiro=sc.nextFloat();
            saldo+=dinheiro;
        break;
    case 2:
            System.out.println("Quanto voce quer sacar");
            dinheiro=sc.nextFloat();
            saldo-=dinheiro;
        break;
    case 3:
            if(saldo==0){
            System.out.println("O saldo total e "+saldo);    
            System.out.println("Conta zerada");
            }
            
            if(saldo<0){
            System.out.println("O saldo total e "+saldo+" reais");
            System.out.println("Conta estourada");
            }
            
            if(saldo>0){
            System.out.println("O saldo total e "+saldo);
            System.out.println("Conta preferencial");
            }
        break;
    
    }
    
    }while(opcao!=3);
    }
}
