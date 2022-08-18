
public class Carro {
	int anoFabricacao;
    String marca;
    String chassi;
    String cor;
    boolean arCondicionado;
    boolean direcaoHidraulica;
    String resposta;
   
    public void ligar(boolean ligado){
    	this.arCondicionado = ligado;
    }
    
    public void desligar(boolean desligado){
    	this.arCondicionado = desligado;
    } 
    
    public boolean retornarStatusAr (){
        return this.arCondicionado;
    }
    
    public void parar(boolean parado){
    	this.direcaoHidraulica = parado;
    }  
    
    public void correr(boolean correndo) {
    	this.direcaoHidraulica = correndo;
    }
    
    public boolean retornarStatusDirecao (){
        return this.direcaoHidraulica;
    }
    
    public void Marca  (String novoNome){
        this.marca = novoNome;
    }
    
    public String retornarMarca (){
        return this.marca;
    }
    
    public void Chassi  (String novoNome){
        this.chassi = novoNome;
    }
    
    public String retornarChassi (){
        return this.chassi;
    }
    
    public void Cor  (String novoNome){
        this.cor = novoNome;
    }
    
    public String retornarCor (){
        return this.cor;
    }
    
    public void AF  (int ano){
        this.anoFabricacao = ano;
    }
    
    public String retornarAF  (){
    	
    	if(anoFabricacao>=1900) {
            resposta= Integer.toString(anoFabricacao);        
    	}
    	else {
    		resposta="Ano de Fabricação Inválido";
    	}
		return this.resposta;
    }
    
    
}
