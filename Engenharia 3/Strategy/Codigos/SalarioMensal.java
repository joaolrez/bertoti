public class SalarioMensal {
    private HorasExtras horasExtras;
    
    public SalarioMensal(HorasExtras horasExtras) {
        this.horasExtras = horasExtras;
    }
    
    public void definirSalarioExtra(HorasExtras horasExtras) {
        this.horasExtras = horasExtras;
    }
    
    public double calculoSalarioFinal(double valorTotal) {
        return horasExtras.calcularAcrescimo(valorTotal);
    }
}
