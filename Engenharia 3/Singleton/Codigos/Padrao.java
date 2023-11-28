public class Padrao {
    private static Padrao instance;
    private String duracao;
    private String tema;

    private Padrao() {
        this.duracao = "30s";
        this.tema ="futebol";
    }

    public static Padrao getInstance() {
        if (instance == null) {
            instance = new Padrao();
        }
        return instance;
    }   

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String novoDuracao) {
        duracao = novoDuracao;
    }

    public String getTema(){
        return tema;
    }

    public void setTema(String novoTema) {
        tema = novoTema;
    }
}
