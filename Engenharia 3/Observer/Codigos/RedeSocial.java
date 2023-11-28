import java.util.ArrayList;
import java.util.List;

public class RedeSocial {
    private List<Seguidor> seguidores = new ArrayList<>();

    public void adicionarSeguidor(Seguidor seguidor) {
        seguidores.add(seguidor);
    }

    public void removerSeguidor(Seguidor seguidor) {
        seguidores.remove(seguidor);
    }

    public void enviarPublicacao(String publicacao) {
        notificarSeguidores(publicacao);
    }

    private void notificarSeguidores(String publicacao) {
        for (Seguidor seguidor : seguidores) {
            seguidor.receberNotificacao(publicacao);
        }
    }
}
