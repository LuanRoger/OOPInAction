package Models;

public abstract class Ave extends Animal {
    public boolean podeVoar;
    public Ave(String nome, boolean podeVoar) {
        super(nome);
        this.podeVoar = podeVoar;
    }
}
