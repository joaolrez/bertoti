public class HorasExtrasDez implements HorasExtras {
    @Override
    public double calcularAcrescimo(double valorTotal) {
        return valorTotal + (10 * 150); // Acrescenta ao salário final
    }
}