/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author black
 */
public class ex16 {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
	   System.out.println("De o horario do começo do jogo:  ");
	   int C= sc.nextInt();
	   System.out.println("De o horario do fim do jogo:  ");
	   int F= sc.nextInt();
	   C-=24;
	   C*=-1;
	   int jogo= C+F;
	   if(jogo>24){
	       jogo-=24;
	       System.out.println("O jogo durou: "+jogo);
	   }
	   else{
	       System.out.println("O jogo durou: "+jogo+" hora(s)");
	   }
	}
}
