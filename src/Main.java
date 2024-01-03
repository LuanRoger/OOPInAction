import Models.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", "Bloomsbury", 1997, 255);

        String tituloMensagem = String.format("Titulo do livro: %s", livro.getTitulo());
        String autorMensagem = String.format("Autor do livro: %s", livro.getAutor());
        String editoraMensagem = String.format("Editora do livro: %s", livro.getEditora());
        String anoPublicacaoMensagem = String.format("Ano de publicação do livro: %s", livro.getAnoPublicacao());
        String numbPaginasMensagem = String.format("Número de páginas do livro: %s", livro.getNumbPaginas());

        System.out.println(tituloMensagem);
        System.out.println(autorMensagem);
        System.out.println(editoraMensagem);
        System.out.println(anoPublicacaoMensagem);
        System.out.println(numbPaginasMensagem);

        System.out.println("Modificando Editora...");
        livro.setEditora("Scholastic");

        editoraMensagem = String.format("Nova editora do livro: %s", livro.getEditora());
        System.out.printf(editoraMensagem);
    }
}