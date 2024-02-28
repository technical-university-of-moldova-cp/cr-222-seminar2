public abstract class Aircraft {
    protected int height;
    protected int longitude;
    protected int latitude;
    private String name;

    public Aircraft(int height, int longitude, int latitude, String name) {
        this.height = height;
        this.longitude = longitude;
        this.latitude = latitude;
        this.name = name;
    }

    public abstract void simulate(Weather weather);

    public String getName() {
        return name;
    }
}
