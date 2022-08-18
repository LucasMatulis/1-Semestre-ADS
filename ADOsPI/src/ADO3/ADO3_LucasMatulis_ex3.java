package ADO3;

import javax.swing.JOptionPane;

public class ADO3_LucasMatulis_ex3 {

	public static void main(String[] args) {
		int ano=0;
		String n = JOptionPane.showInputDialog("Digite um ano");
                if(n.length()>4 || n.length()<4){
                    System.out.println("Ano invalido");
                }
                else{
                    ano = Integer.parseInt(n);
                    if(ano%4==0 & ano%100!=0 || ano%400==0 ) {
			System.out.println("Ano bissexto");
		}
		else {
			System.out.println("Ano nao bissexto");
		}
                }

	}

}
