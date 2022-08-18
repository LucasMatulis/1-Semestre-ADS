import java.util.Scanner;

public class comandoCarro {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Carro c= new Carro();
		
		int opcao=0;
		int AF=0;
		
		System.out.println("De a marca do carro: ");
		String marca=sc.next();
		c.Marca(marca);
		System.out.println("De o Chassi do carro: ");
		String chassi=sc.next();
		c.Chassi(chassi);
		System.out.println("De a cor do carro: ");
		String cor=sc.next();
		c.Cor(cor);
		
		do {
		System.out.println("De o ano de fabricação do carro: ");
		AF=sc.nextInt();
		c.AF(AF);
		
		if(AF<1900) {
			System.out.println(c.retornarAF());
		}
		
		}while(AF<1900);
		
		System.out.println("Marca do carro: "+c.retornarMarca()+"\nChassi do carro: "+c.retornarChassi()+"\nCor do carro: "+c.retornarCor()+"\nAno de fabricação: "+c.retornarAF());
		
		
		
		while(opcao!=5) {
		
		System.out.println("[1]Ligar ar condicionado \n[2]Desligar ar condicionado\n[3]Acelerar\n[4]Freiar\n[5]Desligar");
		opcao=sc.nextInt();
		
		switch(opcao) {
		
		case 1:
			 c.ligar(true);
			 System.out.println("status do ar condicionado: "+c.retornarStatusAr());
			 break;
		case 2:
			 c.ligar(false);
			 System.out.println("status do ar condicionado: "+c.retornarStatusAr());
			 break;
		case 3:
			 c.correr(true);
			 System.out.println("status se o carro está se movendo: "+c.retornarStatusDirecao());
			 break;
		case 4:
			 c.parar(false);
			 System.out.println("status se o carro está se movendo: "+c.retornarStatusDirecao());
			 break;
			
		case 5:
			System.out.println("O carro está desligado");
			break;
		
		
		
		}
		
		
		
		}

	}

}
