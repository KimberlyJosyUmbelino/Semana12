public class Pagamento
{
   //Atributos
   private String nomeDoPagador;
   private String cpf;
   private double  valorASerPago;
   // metodos construtores
   public Pagamento(String nomeDoPagador, String cpf , double valorASerPago)
   {
      this.nomeDoPagador = nomeDoPagador;
      this.cpf = cpf;
      this.valorASerPago = valorASerPago;
   }
   // metodos de acesso 
   public String getNomeDoPagador() 
   {
      return nomeDoPagador;
   }
   public String getCpf() 
   {
      return cpf;
   }
   public double getValorASerPago()
   {
      return valorASerPago;
   }
   // metodos modifcadores para os atributos
   public void setNomeDoPagador(String nomeDoPagador) 
   {
      this.nomeDoPagador = nomeDoPagador;
   }
   public void setCpf(String cpf) 
   {
      this.cpf = cpf;
   }
   public void setValorASerPago(double valorASerPago) 
   {
     this.valorASerPago = valorASerPago;
   }
}