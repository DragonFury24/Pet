public class SmallMammal extends Pet {
    public SmallMammal(String n, int a, double w) {
        super(n, a, w);
    }

    public void eatPoo() {
        loseWeight();
    }

    public void gainWeight() {
        super.setWeight(getWeight() + .2);
    }

    public void loseWeight() {
        super.setWeight(getWeight() - .2);
    }
}
