public abstract class Bebidas implements Pedido {
    private View view;
    private Pizzaria pizza;

    public void bebidaPedido(){
        System.out.println("O pedido da bebida foi registrado");
    }

    public void setVisualizador(View view){
        this.view = view;
    }
}