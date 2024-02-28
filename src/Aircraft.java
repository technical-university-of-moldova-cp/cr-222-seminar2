public abstract class Aircraft {
    private static int nexId=1;
    protected int height;
    protected int longitude;
    protected int latitude;
    private String name;
    private int id;

    public Aircraft(int height, int longitude, int latitude, String name) {
        this.height = height;
        this.longitude = longitude;
        this.latitude = latitude;
        this.name = name;
        this.id = getNextId();
    }

    private static int getNextId() {
        return nexId++;
    }

    public abstract void simulate(Weather weather);

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
