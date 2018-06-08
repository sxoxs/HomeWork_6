package logik;

import java.util.Random;

public class Work {
    public void showHomeWork(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Кот: ");
            shower(new Cat());
            System.out.println();
            System.out.println("Собака: ");
            shower(new Dog());
            System.out.println();
        }
    }

    private  <T extends Animal> void shower(T animal) {

        Random rn = new Random();
        animal.jump(rn.nextDouble()*2);
        animal.run(rn.nextInt(650)+1);
        animal.swim(rn.nextInt(15)+1);
    }
}
