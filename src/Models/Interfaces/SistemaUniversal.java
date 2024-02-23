package Models.Interfaces;

public interface SistemaUniversal {
    void verTodosUsuario();
    void criarUsuario(String nome);
    void deletarUsuario(String nome);
    void atualizarUsuario(String nomeAtual, String novoNome);
}
