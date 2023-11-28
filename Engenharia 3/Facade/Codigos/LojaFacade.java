public class LojaFacade {
    private EnvioProduto envio;
    private EstoqueLoja estoque;

    public LojaFacade() {
        this.envio = new EnvioProduto();
        this.estoque = new EstoqueLoja();
    }

    public void comprarProduto(String nomeProduto, String modeloProduto, String marcaProduto) { 
        System.out.println("Comprando produto: " + nomeProduto + "  da marca " + marcaProduto + " e do modelo " + modeloProduto);
        estoque.consultar();
        ProdutoE produto = buscarProduto(nomeProduto, modeloProduto, marcaProduto);
        if (produto != null) {
            System.out.println("Produto encontrado");
            envio.enviar();
            System.out.println("Compra feita");
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public void reembolsoProduto(String nomeProduto, String modeloProduto, String marcaProduto) {
        System.out.println("Reembolsando: "+ nomeProduto + " da marca " + marcaProduto + " e do modelo " + modeloProduto);
        ProdutoE produto = buscarProduto(nomeProduto, modeloProduto, marcaProduto);
        if (produto != null){
            System.out.println("Produto encontrado");
            System.out.println("Reembolso Completado");
        } else {
            System.out.println("Produto não encontrado");
        }

    }


    private ProdutoE buscarProduto(String nomeProduto, String marcaProduto, String modeloProduto) {
        return new ProdutoE(nomeProduto, marcaProduto, modeloProduto);
    }
}


