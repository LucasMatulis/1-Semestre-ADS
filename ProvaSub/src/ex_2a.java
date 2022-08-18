import java.util.Scanner;

public class ex_2a {
	static Scanner sc =new Scanner(System.in);
	 static void print(int[][]matriz){

	        int soma=0;

	        for(int i=0;i<matriz.length;i++){
	            for(int j=0;j<matriz[i].length;j++){
	                if (matriz[i][j]%2==0){
	                    soma+=matriz[i][j];
	                    System.out.println("A soma dos elementos pares é: "+soma);
	                }
	            }
	        }


	    }
	    public static void main(String[]args){

	        int[][] matriz={{1,2,3,4,5,6},{7,8,9,10,11,12}};

	            print(matriz);
	    }

}

