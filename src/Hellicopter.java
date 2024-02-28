public class Hellicopter extends Aircraft {

    public Hellicopter(String name, int height, int longitude, int latitude) {
        super(height, longitude, latitude, name);
    }

    @Override
    public String toString() {
        return "Hellicopter{" +
                "height=" + height +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }

    @Override
    public void simulate(Weather weather) {
        switch (weather) {
            case SUN -> {
                latitude +=5;
                height += 7;
                System.out.println("Mama mia is hot here");
            }
            case RAIN -> {
                longitude+=3;
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
