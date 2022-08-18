import java.util.Scanner;

public class exVetores {

	public static void main(String[] args) {
		
		int indice=0;// ter o mesmo uso q o i tem para o FOR só q para WHILE
		
		Scanner sc= new Scanner(System.in);
		
		
		int vetor1[]=new int [4];//Criar o vetor e informar a quantidade de numeros dentro dele
		
		//FORMA DE MANUALMENTE FORCENER OS VALORES DOS INDICES/ não recomendavel dependendo da tarefa
		
		vetor1[0]=1;//[0] pois a ordem dos indices dos vetores são 0,1,2,3,4...i-1
		vetor1[1]=2;
		vetor1[2]=3;
		vetor1[3]=4;//[3] pois o ultimo indice do vetor e a quantidade de indices menos 1

		
		int vetor2[]= {5,6,7,8}; //Criar o vetor e já fornecer os valores dentro dele
		
		int vetor3[]= new int [4];//Vetor q usaremos para dar valores dentro dele
		
		//usando FOR
		
		for (int i=0; i<vetor3.length;i++) {//length quer dizer a quantidade de indices do vetor, neste caso é 4 
			
			System.out.println("Informe o valor do indice "+i+" do vetor3");//dar os valores dos indices do vetor
			
			vetor3[i]=sc.nextInt();// [i] pois conforme o i do FOR vai aumentando tambem o numero do indice, neste caso vai começar com vetor3[0] depois vetor3[1] depois vetor3[2] depois vetor3[3]
			
		}
		
		for(int i=0; i<vetor3.length;i++) {
			
			System.out.println("Os valor do indice "+i+" do vetor1 é: "+vetor1[i]);
		
			System.out.println("Os valor do indice "+i+" do vetor2 é: "+vetor2[i]);
			
			System.out.println("Os valor do indice "+i+" do vetor3 é: "+vetor3[i]);
		}
		
		
		//usando WHILE
		
//		while(indice<vetor3.length) {
//			
//			System.out.println("Informe o valor do indice "+indice+" do vetor3");
//			
//			vetor3[indice]=sc.nextInt();
//			
//			indice++;// aumentar o valor do indice até chegar a mesma quantidade de indices do vetor3, no caso 4
//		}
//		
//		indice=0;// resetar o valor do indice para poder usalo de novo em outro while
//		
//		while(indice<vetor3.length) {
//			
//			System.out.println("Os valor do indice "+indice+" do vetor1 é: "+vetor1[indice]);
//			
//			System.out.println("Os valor do indice "+indice+" do vetor2 é: "+vetor2[indice]);
//			
//			System.out.println("Os valor do indice "+indice+" do vetor3 é: "+vetor3[indice]);
//			
//			indice++;
//		}

	}

}
