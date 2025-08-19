public class Livro {
    String titulo;
    int numeroPaginas;
    int anoPublicacao;
    double preco;

    public Livro(String titulo, int numeroPaginas, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public void mostrarInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Preço: R$" + preco);
    }
}
