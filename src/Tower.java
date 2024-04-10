import java.util.ArrayList;

public class Tower implements Publisher{
private ArrayList<Aircraft> aircrafts=new ArrayList<>();
    public void register(Aircraft aircraft) {
        aircrafts.add(aircraft);
        log("registered to the weather tower", aircraft);
        aircraft.registerPublisher(this );
    }


    public void simulate() {
        Weather[] weathers=new Weather[]{Weather.SNOW, Weather.SUN};
        for (Weather weather : weathers) {
            for (Aircraft aircraft : aircrafts) {
                aircraft.simulate(weather);

            }
        }

    }

    @Override
    public void publish(Aircraft aircraft) {
    aircrafts.remove(aircraft);
    log("deregistered to the weather tower", aircraft);

    }
    private void log(String message, Aircraft aircraft) {
        System.out.println("Tower says: "+
                aircraft.getClass().getName() +
                "#"+aircraft.getName()+
                "("+aircraft.getId()+") "+ message);
    }
}
