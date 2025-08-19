public class ProjetoLivraria {
    public static void main(String[] args) {
        // Criando objetos da classe Livro
        Livro obj1 = new Livro("Dom Casmurro", 256, 1899, 39.90);
        Livro obj2 = new Livro("A Moreninha", 180, 1844, 29.90);

        obj2.preco = 24.90;
        obj2.anoPublicacao = 1850;

        System.out.println("Informações do obj1:");
        obj1.mostrarInformacoes();

        System.out.println("\nInformações do obj2 (com alterações):");
        obj2.mostrarInformacoes();

        // Criando objetos da classe Autor
        Autor autor1 = new Autor("Machado de Assis", "Brasileiro", 1839);
        Autor autor2 = new Autor("Joaquim Manuel de Macedo", "Brasileiro", 1820);

        System.out.println("\nDados do autor1:");
        autor1.mostrarDados();
        System.out.println("Idade em 2025: " + autor1.calcularIdade(2025));

        System.out.println("\nDados do autor2:");
        autor2.mostrarDados();
        System.out.println("Idade em 2025: " + autor2.calcularIdade(2025));
    }
}
