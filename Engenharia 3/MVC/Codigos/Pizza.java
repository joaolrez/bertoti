public class Pizza{
    private String sabor;
    private double preco;


    public void Produto(String nome, double preco){
      this.preco = preco;
      this.sabor = nome;
    }
    
    public double getPreco(){
      return this.preco;
    }

    public String getSabor(){
      return this.sabor;
    }
    

  }