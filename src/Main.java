//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Jet jet = new Jet(50, 150, 100);
        jet.simulate(Weather.RAIN);
        jet.simulate(Weather.SUN);
        jet.simulate(Weather.FOG);
        jet.simulate(Weather.SNOW);

    }

}
