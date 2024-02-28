public class Tower {

    public void register(Aircraft aircraft) {
        System.out.println("Tower says: "+aircraft.getClass().getName()+"#"+aircraft.getName()+"(1) registered to the weather tower");
    }


}
