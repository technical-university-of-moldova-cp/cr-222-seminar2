public class Jet extends Aircraft {


    public Jet(String name, int height, int longitude, int latitude) {
        super(height, longitude, latitude, name);
    }

    @Override
    public String toString() {
        return "Jet{" +
                "height=" + height +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }

    @Override
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
