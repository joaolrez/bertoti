public class HorasExtrasUm implements HorasExtras {
    @Override
    public double calcularAcrescimo(double valorTotal) {
        return valorTotal + (1 * 150); //Acrescenta ao salário final
    }
}
