package logik;

import java.util.Random;

public class Dog extends Animal{
    public Dog() {
        Random rn = new Random();
        super.setRunDistance(rn.nextInt(200) + 400);
        super.setJumpDistance(rn.nextDouble() + 0.5);
        super.setSwimDistance(rn.nextInt(4) + 9);
    }
}
