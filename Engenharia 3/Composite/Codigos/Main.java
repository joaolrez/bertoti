public class Main {
    public static void main(String[] args) {
        CestaFrutas cesta = new CestaFrutas();

        Produto fruta1 = new Fruta("Maçã", 7, 2.0);
        Produto fruta2 = new Fruta("Banana", 3.0, 3.5);

        cesta.adicionarFruta(fruta1);
        cesta.adicionarFruta(fruta2);

        Estoque estoque = new Estoque();
        estoque.verificar();

        cesta.comprar();

        Envio envio = new Envio();
        envio.enviar();
    }
}
