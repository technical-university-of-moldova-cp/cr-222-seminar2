public class Tower {

    public void register(Aircraft aircraft) {
        System.out.println("Tower says: "+
                aircraft.getClass().getName() +
                "#"+aircraft.getName()+
                "("+aircraft.getId()+") registered to the weather tower");
    }


}
