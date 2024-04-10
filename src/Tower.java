import java.util.ArrayList;

public class Tower implements Publisher{
private ArrayList<Aircraft> aircrafts=new ArrayList<>();
    public void register(Aircraft aircraft) {
        aircrafts.add(aircraft);
        System.out.println("Tower says: "+
                aircraft.getClass().getName() +
                "#"+aircraft.getName()+
                "("+aircraft.getId()+") registered to the weather tower");
    }


    public void simulate() {
        for (Aircraft aircraft : aircrafts) {
            aircraft.simulate(Weather.SUN);
        }
    }

    @Override
    public void publish(Aircraft aircraft, CrashEvent crashEvent) {

    }
}
