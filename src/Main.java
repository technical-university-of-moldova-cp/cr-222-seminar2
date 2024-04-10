//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Jet jet = new Jet("Stas", 5, 150, 100);
        Hellicopter hellicopter = new Hellicopter("Elionora", 95, 30, 30);

        Tower tower = new Tower();
        tower.register(jet);
        tower.register(hellicopter);
        tower.simulate();

    }

}
