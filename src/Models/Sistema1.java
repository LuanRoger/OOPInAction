package Models;

import Models.Interfaces.SistemaUniversal;

import java.util.ArrayList;

public class Sistema1 implements SistemaUniversal {
    private final ArrayList<String> usuarios;

    public Sistema1() {
        this.usuarios = new ArrayList<String>();
    }

    @Override
    public void verTodosUsuario() {
        for (final String usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    @Override
    public void criarUsuario(String nome) {
        usuarios.add(nome);
    }

    @Override
    public void deletarUsuario(String nome) {
        usuarios.remove(nome);
    }

    @Override
    public void atualizarUsuario(String nomeAtual, String novoNome) {
        final int toUpdateIndex = usuarios.indexOf(nomeAtual);
        usuarios.remove(nomeAtual);
        usuarios.add(toUpdateIndex, novoNome);
    }
}
