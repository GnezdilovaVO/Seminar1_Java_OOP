import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal barsik = new Animal("Барсик", "Ольга", "простуда", false);
        System.out.println(barsik.isVaccinated());
        barsik.setVaccinate(true);
        System.out.println(barsik.isVaccinated());
        System.out.println(barsik.getType());
        Animal musya = new Cat();
        Cat cat = new Cat();
        Dog pes = new Dog("Max", null, null, false);
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(pes);
        animals.add(musya);
        // System.out.println(animals);
        // System.out.println(musya.getType());
        // System.out.println(musya.getType("arg "));
        Animal gosha = new Bird("Гоша", "Иван", "простуда", false, 15);
        // cat.hunt();
        cat.toSwim();
        pes.toSwim();
        gosha.toFly();
        gosha.toSwim();
        Animal jack = new Spaun("Джек", "Петр", "простуда", false, 8);
        jack.toFly();
        jack.toSwim();
        pes.toSwim();
    }
}
