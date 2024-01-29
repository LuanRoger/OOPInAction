import Models.Ave;
import Models.Galinha;
import Models.Gaviao;

public class Main {
    public static void main(String[] args) {
        Ave galinha = new Galinha();
        Ave gaviao = new Gaviao();

        consegueVoar(galinha);
        consegueVoar(gaviao);
    }

    private static void consegueVoar(Ave ave) {
        String podeVoarMessage = String.format("%s pode voar", ave.getNome());
        String nPodeVoarMessage = String.format("%s não pode voar", ave.getNome());

        if(ave.podeVoar) {
            System.out.println(podeVoarMessage);
            return;
        }

        System.out.println(nPodeVoarMessage);
    }
}