public class Jet {
    private int height;
    private int longitude;
    private int latitude;

    public Jet(int height, int longitude, int latitude) {
        this.height = height;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Jet{" +
                "height=" + height +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }

    public void simulate(Weather weather) {
        switch (weather) {
            case SUN -> {
                latitude +=10;
                height += 2;
            }
            case RAIN -> {
                latitude += 5;
            }
        }

    }
}
