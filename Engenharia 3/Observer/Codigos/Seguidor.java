    public class Seguidor {
    private String nome;

    public Seguidor(String nome) {
        this.nome = nome;
    }

    public void receberNotificacao(String publicacao) {
        System.out.println("Olá, " + nome + "! Você recebeu uma nova publicação: " + publicacao);
    }
}
