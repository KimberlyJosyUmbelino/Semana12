public class Boleto extends Pagamento
{
   //atributo proprio
   private String numeroDoBoleto;
   private int dia;
   private int mes;
   private int ano;
   private int vencimento;
   //Construtores
   public Boleto(String numero,int d,int m,int a,int v,String nome, String c , double valor)
   {
      super (nome,c,valor);
      numeroDoBoleto = numero;
      dia=d;
      mes=m;
      ano=a;
      vencimento=v;
   }
   //metodos de acesso
   public String getNumeroDoBoleto()
   {
      return numeroDoBoleto;
   }
   public int getDia()
   {
      return dia;
   }
   public int getMes()
   {
      return mes;
   }
   public int getAno()
   {
      return ano;
   }
   public int getVencimento()
   {
      return vencimento;
   }
   //metodos de modificadores
   public void setNumeroDoBoleto(String numeroDoBoleto)
   {
      this.numeroDoBoleto = numeroDoBoleto;
   }
   public void setDia(int dia)
   {
      this.dia = dia;
   }
   public void setMes(int mes)
   {
      this.mes = mes;
   }
   public void setAno(int ano)
   {
      this.ano = ano;
   }
   public void setVencimento(int vencimento)
   {
      this.vencimento = vencimento;
   }
}