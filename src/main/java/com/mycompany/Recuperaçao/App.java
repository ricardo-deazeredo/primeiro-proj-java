public class App {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA DE GERENCIAMENTO DE ESPORTES ---");

        // Criando instâncias das subclasses concretas
        Futebol meuFutebol = new Futebol();
        Basquete meuBasquete = new Basquete();

        // 1. Executando as funcionalidades do Futebol
        System.out.println("\n==================================");
        System.out.println(">> TESTE DE EXECUÇÃO: FUTEBOL");
        meuFutebol.exibirInformacoes(); 
        meuFutebol.iniciarPartida();    

        // 2. Executando as funcionalidades do Basquete
        System.out.println("\n==================================");
        System.out.println(">> TESTE DE EXECUÇÃO: BASQUETE");
        meuBasquete.exibirInformacoes(); 
        meuBasquete.iniciarPartida();    
        
        // 3. Demonstração de execução via Polimorfismo
        System.out.println("\n==================================");
        System.out.println(">> TESTE DE EXECUÇÃO: POLIMORFISMO");
        
        Esporte esporteQualquer = new Futebol();
        System.out.println("\nExecutando (iniciarPartida) usando referência Esporte:");
        esporteQualquer.iniciarPartida();
    }
}