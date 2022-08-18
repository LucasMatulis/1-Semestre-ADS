
public class exFuncao {

	static  void Void() {
		
		System.out.println("Função void");
	}
	
	static String string(String B) {
		
		return(B);
	}
	
//	static String C(String B) {
//		int n=1;
//		
//		return(n);//erro, pois uma função String só pode retornar String
//	}
	
	
	static  int Int(int n) {
		double C=101010;
		return(n);
	}
	
//	static  int n2(int n2) {
//		double C=101010;
//		return(C);//erro, pois uma função Int só pode retornar Int
//	}
	
	static double Double(double n) {
		int n2=1;
		
		return(n2);//Não da erro pois double contem uma opção de numeros mais longo q de Int, Float e Long
	}
	
	static int[] vetor(int v[]) {
		
		for(int i=0; i<v.length ;i++) {
			
			v[i]=i;
		}
		
		return v;
	}

	public static void main(String[] args) {
		
		int n=10;
		String B="Função String";
		int vetor[]=new int [4];
		
		
		System.out.println("Funcao int: "+Int(n));
		System.out.println(string(B));
		Void();
		
		for(int i=0; i<vetor.length ;i++) {
			
			System.out.println("Função vetor ["+i+"]: "+vetor(vetor)[i]);//retornar vetor de uma função
		}

	}

}
