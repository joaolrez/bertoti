import java.util.List;

public abstract class View implements Observer {
    private Pedido ultimoPedido;
    private List<Pizza> pizza;

    public void setUltimoPedido(Pedido pedido){
        this.ultimoPedido = pedido;
    }

    public void atualizar(List<Pizza> pizza){
        this.pizza = pizza;
    }
}
