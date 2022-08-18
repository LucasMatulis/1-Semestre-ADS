/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author black
 */
public class ex9 {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
	   System.out.println("Digite o numero de cadastro:  ");
	   int ID= sc.nextInt();
	   System.out.println("Digite as horas trabalhados:  ");
	   float horas= sc.nextFloat();
	   System.out.println("Digite o valor recebido por hora:  ");
	   float valor= sc.nextFloat();
	   float salario = horas*valor;
	   
	   System.out.println("Funcionario "+ID+" o seu salario é de "+salario+" reais");
	}
}
