package logik;

import java.util.Random;

public class Cat extends Animal {
    public Cat() {
        Random rn = new Random();
        super.setRunDistance(rn.nextInt(101) + 150);
        super.setJumpDistance(rn.nextDouble() + 1);
        super.setSwimDistance(0);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кошки не плавают");
    }

}
