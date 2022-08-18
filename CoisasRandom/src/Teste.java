 public class Teste{
   
    public static void main (String[] args){
         
          long l = 10;
          Pessoa p = new Pessoa();
          Teste e = new Teste();
         
          p.alterarNome("Alfredo");
          System.out.println("Valor antes d metodo: " + l);
          System.out.println("Nome antes do metodo: " + p.retornarNome());
         
          e.alterar(l, p);
         
          System.out.println("Nome depois do metodo: " + p.retornarNome());
          System.out.println("Valor depois do metodo: " + l);
    }
   
    public void alterar(long l, Pessoa p){
          l = 50;
          p.alterarNome("Juliana");
    }
}
