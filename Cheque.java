public class Cheque extends Pagamento
{
   //atributos proprio
   private String numeroDoCheque;
   //construtores
   public Cheque(String numero,String nome, String c , double valor)
   {
      super (nome,c,valor);
      numeroDoCheque=numero;
   }
   //metodos de acesso
   public String getNumeroDoChque()
   {
      return numeroDoCheque;
   }
   //metodos de modificadores
   public void setNumeroDoCheque(String numeroDoCheque)
   {
      this.numeroDoCheque = numeroDoCheque;
   }
}