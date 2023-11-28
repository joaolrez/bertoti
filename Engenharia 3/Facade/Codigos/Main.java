public class Main {
    public static void main(String[] args) {
        LojaFacade lojaFacade = new LojaFacade();
        String nomeProduto = "Smartphone";
        String marcaProduto = "Samsung"; 
        String modeloProduto = "A4";

        lojaFacade.comprarProduto(nomeProduto, modeloProduto, marcaProduto);
        lojaFacade.reembolsoProduto(nomeProduto, modeloProduto, marcaProduto);

    }
}
