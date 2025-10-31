public class Basquete extends Esporte {

    // Construtor: define nome e número de jogadores padrão
    public Basquete() {
        super("Basquete", 5); // 5 jogadores por time
    }

    /**
     * Implementação obrigatória do método abstrato iniciarPartida() da classe Esporte.
     */
    @Override
    public void iniciarPartida() {
        System.out.println("\n--- Iniciando Partida de " + getNome() + " ---");
        System.out.println("A partida de Basquete é iniciada com um **salto entre dois** (jump ball) no círculo central.");
        System.out.println("O objetivo é fazer pontos arremessando a bola através do aro do adversário.");
    }
}