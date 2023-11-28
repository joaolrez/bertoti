public class Main {
    public static void main(String[] args) {

        Padrao padrao = Padrao.getInstance();

        System.out.println("Padrão de temas: " + padrao.getTema());
        System.out.println("Padrão de duração: " + padrao.getDuracao());

        padrao.setDuracao("2min");
        padrao.setTema("musica");

        System.out.println("Padrão de temas: " + padrao.getTema());
        System.out.println("Padrão de duração: " + padrao.getDuracao());
    }
}
