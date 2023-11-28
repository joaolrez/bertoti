public class HorasExtrasCinco implements HorasExtras {
    @Override
    public double calcularAcrescimo(double valorTotal) {
        return valorTotal + (5 * 150); // Acrescenta ao salário final
    }
}
