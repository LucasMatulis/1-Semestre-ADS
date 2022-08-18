import java.util.Random;

import javax.swing.JOptionPane;

public class Calculadora {
	
	static double soma(double r, double n) {
		
		return(r+n);
	}
	
	static double sub(double r, double n) {
		
		return(r-n);
	}

	static double div(double r, double n) {
	
		return(r/n);
	}

	static double mult(double r, double n) {
	
		return(r*n);
	}

	static double raiz(double r) {
	
		return(Math.sqrt(r));
	}

	static double poten(double r, double n) {
	
		return(Math.pow(r,n));
	}

	static double arr(double r) {
	
		return(Math.round(r));
	}

	static double reset(double r) {
	
		return(r=0);
	}
	static void megasena(int r[]) {
		
		String nome="";
		
		for(int i=0;i<6;i++) {
			
			r[i] = new Random().nextInt(60)+1;
			
			for(int j=0;j<6;j++) {
				
				if(r[i]==r[j] & j!=i) {
					
					r[i] = new Random().nextInt(60)+1;
				}
				
			}
			nome+="-"+r[i]+"-";
		}
		
		JOptionPane.showMessageDialog(null, nome);
	}
	
	

	public static void main(String[] args) {
		double resul=0;
		double n;
		int escolha=8;
		boolean on=true;
		int megasena[]=new int [6];
		
		
		do {
			
			if(escolha==8||escolha==9|| escolha==10) {
				resul=Double.parseDouble(JOptionPane.showInputDialog("Digite o número: "));
			}
			
			
			escolha=Integer.parseInt(JOptionPane.showInputDialog("Valor atual: "+resul+ "\n[0]OFF\n[1]+\n[2]-\n[3]÷\n[4]X\n[5]raiz\n[6]elevado\n[7]arr\n[8]reset\n[9]mega sena\n[10]="));
			switch(escolha) {
			case 0:
				on=false;
				JOptionPane.showMessageDialog(null, "Programa encerrado");
				break;
			case 1:
				n= Double.parseDouble(JOptionPane.showInputDialog("Valor atual: "+resul+ "\nDigite o número: "));
				resul=soma(resul,n);
				break;
			case 2:
				n= Double.parseDouble(JOptionPane.showInputDialog("Valor atual: "+resul+ "\nDigite o número: "));				
				resul=sub(resul,n);
				break;
			case 3:
				n= Double.parseDouble(JOptionPane.showInputDialog("Valor atual: "+resul+ "\nDigite o número: "));				
				resul=div(resul,n);
				break;	
			case 4:
				n= Double.parseDouble(JOptionPane.showInputDialog("Valor atual: "+resul+ "\nDigite o número: "));				
				resul=mult(resul,n);
				break;
			case 5:
				resul=raiz(resul);
				break;
			case 6:
				n= Double.parseDouble(JOptionPane.showInputDialog("Valor atual: "+resul+ "\nDigite o número: "));				
				resul=poten(resul,n);
				break;
			case 7:
				resul=arr(resul);
				break;
			case 8:
				resul=reset(resul);
				break;
			case 9:
				megasena(megasena);
				break;
			case 10:
				JOptionPane.showMessageDialog(null, "Resultado: "+resul);
				resul=0;
				break;	
			}
			
			
			
			
		}while(on);
		
		

	}

}
