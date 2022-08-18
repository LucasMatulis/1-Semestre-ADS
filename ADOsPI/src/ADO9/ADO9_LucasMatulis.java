package ADO9;
import java.util.Random;
import java.util.Scanner;
public class ADO9_LucasMatulis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random = new Random();
		int x;
		System.out.println("De o valor minimo");
		int min= sc.nextInt();
		System.out.println("De o valor maximo");
		int max= sc.nextInt();
		x=((random.nextInt((max - min) + 1) + min*-1)+1)/(random.nextInt((max - min) + 1) + min+1);
		System.out.println("O valor da solução é: "+x);

	}

}
