public class Main {
    public static void main(String[] args) {
        SalarioMensal pedido = new SalarioMensal(new HorasExtrasZero());

        double valorTotal = 1000;

        System.out.println("Valor total: " + valorTotal);

        pedido.definirSalarioExtra(new HorasExtrasUm());
        System.out.println("Valor com desconto: " + pedido.calculoSalarioFinal(valorTotal));

        pedido.definirSalarioExtra(new HorasExtrasCinco());
        System.out.println("Valor com desconto: " + pedido.calculoSalarioFinal(valorTotal));
        
        pedido.definirSalarioExtra(new HorasExtrasDez());
        System.out.println("Valor com desconto: " + pedido.calculoSalarioFinal(valorTotal));
    }
}
