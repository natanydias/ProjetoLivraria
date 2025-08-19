public class Autor {
    String nome;
    String nacionalidade;
    int anoNascimento;

    public Autor(String nome, String nacionalidade, int anoNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.anoNascimento = anoNascimento;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Ano de nascimento: " + anoNascimento);
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }
}
