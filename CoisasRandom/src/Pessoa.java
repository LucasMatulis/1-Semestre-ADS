
import java.util.Random;
import java.util.Scanner;
public class Pessoa {

	   
    Scanner sc = new Scanner(System.in);

    static char []sex (){
        Scanner sc = new Scanner(System.in);
        char vs[] = new char [5];
        for (int i=0; i < vs.length;i++){
        System.out.println("Insira seu sexo: ");
        vs [i] = sc.next().charAt(0);

        
        
    }
    return vs;
}

    static char []zoio (){
        Scanner sc = new Scanner(System.in);
        char vo[] = new char [5];
        for (int i=0; i < vo.length;i++){
        System.out.println("Insira a cor do seu olho: ");
        vo [i] = sc.next().charAt(0);


        
        }
        return vo;
    }

    static char []cabelera (){
        Scanner sc = new Scanner(System.in);
        char vc[] = new char [5];
        for (int i=0; i < vc.length;i++){
        System.out.println("Insira a cor do seu cabelo: ");
        vc [i] = sc.next().charAt(0);

   
    
        }
        return vc;    
}
   
    static int []idade (){
        Scanner sc = new Scanner(System.in);
        int vi [] = new int [5];
        for (int i=0; i < vi.length;i++){
        System.out.println("Insira sua idade: ");
        vi [i] = sc.nextInt();
        
     
        }
        return vi;
    }
  
    


    static float creu(int vetor[], char cab[], char oio[]){


        float media=0;
        float qnt=0;

        for(int i=0;i<vetor.length;i++) {
        	
        	if(cab[i]=='P' || oio[i]=='C') {
        		
        		media+=vetor[i];
        		qnt++;
        		
        	}
        	
        	
        }
        return (media/qnt);

    }

    static float mamis (int vetor[]){

        int maior=0;

        for (int i=0; i<vetor.length;i++){
            
            if(vetor[i]> maior){
               maior = vetor[i];
            }    
        }

        return (maior);

    }

    static float eita (int vetor[], char cabe[], char zoio[], char sex[]){

        float qnt=0;

        for (int i=0; i<vetor.length;i++){
            
            if(cabe[i] =='L' && zoio[i] == 'A' && sex[i] == 'M' && (vetor[i]>= 18 || vetor[i]<= 35)){
                qnt++;
            }    
            
        }
        return qnt;
    }

    

public static void main(String[] args) {


char sexo []= sex();
char olhos [] = zoio();
char cabelos [] = cabelera();
int idade [] = idade();

System.out.println("A média da idade das' pessoas com olhos castanho e cabelos pretos "+ creu(idade, cabelos, olhos));

System.out.println("A maior idade é: "+ mamis(idade));

System.out.println("A quantidade de habitantes de olhos azuis, cabelos loiros, do sexo feminino e com a idade entre 18 e 35 é: "+eita(idade, cabelos, olhos, sexo) );


		 
	 }
}

