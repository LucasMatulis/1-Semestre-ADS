
public class ex8 {
	public static void main(String[] args) {
		int n=13;
		int resul=0;
		int med=0;
		while(n<74) {
			if(n%2==0) {
				resul+=n;
				med++;
			}
			n++;
		}
		System.out.println("A media aritimetica de todos os numeros pares � "+(resul/med));
	}
}
