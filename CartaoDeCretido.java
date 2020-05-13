public class CartaoDeCretido extends Pagamento
{
   //Atributo proprio
   private String numeroDoCartao;   
   //metodos construtores
   public  CartaoDeCretido( String numero,String nome, String c , double valor )
   { 
      super (nome,c,valor);
      numeroDoCartao=numero;
   }
   //metodos de acesso
   public String getNumeroDoCartao()
   {
      return numeroDoCartao;
   }
   //metodos modificadores para o atributo proprio
   public void setNumeroDoCartao(String numeroDoCartao)
   {
      this.numeroDoCartao = numeroDoCartao;
   }
}