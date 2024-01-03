package Models;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private int numbPaginas;
    private boolean lido;

    public Livro(String titulo, String autor, String editora, int anoPublicacao, int numbPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.numbPaginas = numbPaginas;
        lido = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getNumbPaginas() {
        return numbPaginas;
    }

    public void ler() {
        lido = true;
    }

    public String jaFoiLido() {
        return lido ? "Sim" : "Não";
    }
}