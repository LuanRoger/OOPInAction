package Models;

public class Gaviao extends Ave {

    public Gaviao() {
        super("Gavião", true);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("AAA AAA");
    }
}
