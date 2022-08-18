/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author black
 */
public class ex10 {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
	   System.out.println("Escreva o seu nome:  ");
	   String ID= sc.next();
	   System.out.println("Digite o salario fixo:  ");
	   float Salario= sc.nextFloat();
	   System.out.println("Digite o valor da quantidade de vendas:  ");
	   float vendas= sc.nextFloat();
	   vendas*=0.15f;
	   float salario = Salario+vendas;
	   System.out.println("Vendendor "+ID+" voce recebera "+salario+" reais no fim do mes");
	}
}
