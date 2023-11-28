public class Fruta implements Produto {
    private String nome;
    private double precoPorKg;
    private double quantidadeEmKg;

    public Fruta(String nome, double precoPorKg, double quantidadeEmKg) {
        this.nome = nome;
        this.precoPorKg = precoPorKg;
        this.quantidadeEmKg = quantidadeEmKg;
    }

    public void comprar() {
        System.out.println("Comprando " + quantidadeEmKg + "kg de " + nome + " por R$" + getValorProduto());
    }

    public double getValorProduto() {
        return precoPorKg * quantidadeEmKg;
    }
}
