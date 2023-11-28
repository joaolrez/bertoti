public class Main {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();
        Seguidor seguidor1 = new Seguidor("Renan");
        Seguidor seguidor2 = new Seguidor("Pedro");

        redeSocial.adicionarSeguidor(seguidor1);
        redeSocial.adicionarSeguidor(seguidor2);

        redeSocial.enviarPublicacao("Boa tarde a todos!");
    }
}
