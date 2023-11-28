public class ProdutoE {
    private String nome;
    private String modelo;
    private String marca;
    private boolean disponivel;

    public ProdutoE(String nome, String modelo, String marca) {
        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
        this.disponivel = true; 
    }

    public String getNome() {
        return nome;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public boolean EstaDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
