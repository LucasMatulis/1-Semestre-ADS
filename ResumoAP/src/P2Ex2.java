
public class P2Ex2 {

	static int impar(int v[]) {
		
		int soma=0;
		
		for(int i=0;i<v.length;i++) {
			
			if(i%2!=0) {
				soma+=v[i];
			}
			
		}
		
		return(soma);
	}
	
	static int par(int v[]) {
		
		int prod=1;
		
		for(int i=0;i<v.length;i++) {
			
			if(i%2==0) {
				prod*=v[i];
				
			}
			
		}
		
		return(prod);
	}
	
	static float div(float n1, float n2) {
		
		return(n1/n2);
	}
	
	static void resul(float resul) {
		
		System.out.println("O resultado é : "+resul);
		
	}
	
	
	public static void main(String[] args) {

		int vetor[]= {1,2,3,4,5,6,7,8,9,10};
		
		int n1= par(vetor);
		
		int n2= impar(vetor);
		
		float div =div(n1, n2);
		
		resul(div);
		
	}
}
