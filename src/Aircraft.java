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

    protected void displayMessage(String message) {
        System.out.println(getClass().getName()+"#" + getName() + "(" + getId() + "): " + message);
    }
    protected void incrementHeight(int height1) {
        height += height1;
        if(height>100)
            height=100;
    }

    @Override
    public String toString() {
        return getClass().getName()+"{" +
                "height=" + height +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }


}
