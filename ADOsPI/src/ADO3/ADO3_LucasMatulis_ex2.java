package ADO3;

import javax.swing.JOptionPane;

public class ADO3_LucasMatulis_ex2 {

	public static void main(String[] args) {
		   float A = Float.parseFloat(JOptionPane.showInputDialog("De o maior lado do triangulo"));
		   float B = Float.parseFloat(JOptionPane.showInputDialog("De outro lado do triangulo"));
		   float C = Float.parseFloat(JOptionPane.showInputDialog("De outro lado do triangulo"));
		   
		   
	 	       if(A>=B+C){
	 	       System.out.println("Nao forma um triangulo");
	     	   }
	     	   else{
	         	   if(A==B && A==C && C==B){
	     	       System.out.println("triangulo equilatero");
	         	   }
	         	   else if(A==B || A==C || C==B){
	         	   System.out.println("triangulo isoseles");
	         	    }
	     	
	                if(A!=B & A!=C & C!=B){
	         	   System.out.println("triangulo escaleno");
	         	    }
	     }

	}

}
