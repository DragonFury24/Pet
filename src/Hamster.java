public class Hamster extends SmallMammal {
    public Hamster(String n, int a, double w) {
        super(n, a, w);
    }

    public void runOnWheel() {
        loseWeight();
    }


}
