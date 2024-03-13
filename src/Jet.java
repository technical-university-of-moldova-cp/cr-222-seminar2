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
                displayMessage("Mama mia is hot here");
            }
            case RAIN -> {
                latitude += 5;
                displayMessage("Its reining as in blade runner");
            }
            case FOG -> {
                latitude+=1;
                displayMessage("Silent Hill vibe");
            }
            case SNOW -> {
                height-=7;
                displayMessage("Back in Fargo");
            }
        }

    }

    private void displayMessage(String message) {
        System.out.println("Jet#" + getName() + "(" + getId() + "): " + message);
    }
}
