import java.util.Scanner;

public class P1Ex2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int numeroImpar=0;
		int div=0;
		
		System.out.println("De o valor inicial");
		int VI=sc.nextInt();
		System.out.println("De o valor final");
		int VF=sc.nextInt();
		
		
		if(VI<VF & VI>=0 & VF>=0) {
			
			while(VI<=VF) {
				
				
				if(VI%2!=0) {
					
					numeroImpar++;
					
				}
				
				if(VI%8==0 & VI%9==0) {
					
					div++;
					
				}
				
				
				VI++;
				
			}
			
			System.out.println(numeroImpar);
			System.out.println(div);
			
		}
		else {
			
			System.out.println("VALORES INVALIDOS");
		}

	}

}
