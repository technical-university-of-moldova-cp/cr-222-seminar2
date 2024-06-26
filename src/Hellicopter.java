public class Hellicopter extends Aircraft {

    public Hellicopter(String name, int height, int longitude, int latitude) {
        super(height, longitude, latitude, name);
    }


    @Override
    public void simulate(Weather weather) {
        switch (weather) {
            case SUN -> {
                latitude +=5;
                incrementHeight(7);
                displayMessage("Mama mia is hot here");
            }
            case RAIN -> {
                longitude+=3;
                displayMessage("Its reining as in blade runner");
            }
            case FOG -> {
                latitude+=1;
                displayMessage("Silent Hill vibe");
            }
            case SNOW -> {
                incrementHeight(-7);
                displayMessage("Back in Fargo");
            }
        }

    }
}
