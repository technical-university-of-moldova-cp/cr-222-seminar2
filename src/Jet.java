public class Jet {
    private int height;

    public Jet(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Jet{" +
                "height=" + height +
                '}';
    }

    public void simulate(Weather weather) {
        height+=10;

    }
}
