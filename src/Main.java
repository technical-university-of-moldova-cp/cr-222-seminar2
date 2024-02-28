//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Jet jet = new Jet(50, 150, 100);
        Hellicopter hellicopter = new Hellicopter(30,30,30);
        jet.simulate(Weather.RAIN);
        jet.simulate(Weather.SUN);
        jet.simulate(Weather.FOG);
        jet.simulate(Weather.SNOW);

        hellicopter.simulate(Weather.SUN);
Tower tower = new Tower();
        tower.register(jet);
        tower.register(hellicopter);

    }

}
