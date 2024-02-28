public abstract class Aircraft {
    protected int height;
    protected int longitude;
    protected int latitude;

    public Aircraft(int height, int longitude, int latitude) {
        this.height = height;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public abstract void simulate(Weather weather);
}
