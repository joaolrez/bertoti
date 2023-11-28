import java.util.ArrayList;
import java.util.List;

public class CestaFrutas implements Produto {
    private List<Produto> frutas;

    public CestaFrutas() {
        frutas = new ArrayList<>();
    }

    public void adicionarFruta(Produto fruta) {
        frutas.add(fruta);
    }

    public void removerFruta(Produto fruta) {
        frutas.remove(fruta);
    }

    public void comprar() {
        System.out.println("Comprando cesta de frutas:");
        for (Produto fruta : frutas) {
            fruta.comprar();
        }
    }

    public double getValorProduto() {
        double total = 0;
        for (Produto fruta : frutas) {
            total += fruta.getValorProduto();
        }
        return total;
    }
}
