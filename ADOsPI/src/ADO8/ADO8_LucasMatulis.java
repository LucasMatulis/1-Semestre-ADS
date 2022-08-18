package ADO8;
import java.util.Random;
public class ADO8_LucasMatulis {

	public static void main(String[] args) {
		int dado;
		int lado[]=new int [6];
		int total=0;
		
		for(int i=0;i<1000000;i++) {
			dado = new Random().nextInt(7);
			
			switch(dado){
				case 1:
					lado[0]++;
					break;
				case 2:
					lado[1]++;
					break;
				case 3:
					lado[2]++;
					break;
				case 4:
					lado[3]++;
					break;
				case 5:
					lado[4]++;
					break;
				case 6:	
					lado[5]++;
					break;
			}
		}
		
		for(int i=0;i<6;i++) {
			total+=lado[i];
		}
		
		for(int i=0;i<6;i++) {
			System.out.println("A porcentagem de vezes que caiu o numero "+(i+1)+" foi "+(float)(lado[i]*100)/total+"%");
		}
		

	}

}
