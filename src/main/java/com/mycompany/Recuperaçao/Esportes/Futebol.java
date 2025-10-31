public class Futebol extends Esporte {

    // Construtor: chama o construtor da classe pai (Esporte)
    public Futebol() {
        // Inicializa o esporte com o nome "Futebol" e 11 jogadores por time
        super("Futebol", 11); 
    }

    /**
     * Implementação obrigatória do método abstrato iniciarPartida() da classe Esporte.
     */
    @Override
    public void iniciarPartida() {
        System.out.println("\n--- Iniciando Partida de " + getNome() + " ---");
        System.out.println("A partida de Futebol é iniciada com o **chute inicial** (kick-off) no centro do campo.");
        System.out.println("Dois times competem para fazer gols usando principalmente os pés.");
    }
}