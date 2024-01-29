package Models;

public class Galinha extends Ave {
    public Galinha() {
        super("Galinha", false);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Co Co");
    }
}
