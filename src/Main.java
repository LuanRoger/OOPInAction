import Models.Interfaces.SistemaUniversal;
import Models.Sistema1;

public class Main {
    public static void main(String[] args) {
        SistemaUniversal sistemaUniversal = new Sistema1();
        sistemaUniversal.criarUsuario("Roger");
        sistemaUniversal.verTodosUsuario();
    }
}