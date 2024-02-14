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
                System.out.println("Mama mia is hot here");
            }
            case RAIN -> {
                latitude += 5;
                System.out.println("Its reining as in blade runner");
            }
            case FOG -> {
                latitude+=1;
                System.out.println("Silent Hill vibe");
            }
            case SNOW -> {
                height-=7;
                System.out.println("Back in Fargo");
            }
        }

    }
}
