package ADO3;

import javax.swing.JOptionPane;

public class ADO3_LucasMatulis_ex1 {
	
	public static void main(String[] args) {
		float produto = Float.parseFloat(JOptionPane.showInputDialog("De o valor do produto"));
		if(produto>=300) {
			System.out.println("Voce conseguiu um desconto de " +(produto*0.2)+" reais, com o valor total do produto sendo "+(produto*0.8)+" reais");
		}
		else {
			System.out.println("Voce conseguiu um desconto de " +(produto*0.15)+" reais, com o valor total do produto sendo "+(produto*0.75)+" reais");
		}

	}

}
