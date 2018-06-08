package logik;
//   2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
public class Animal {
    private int runDistance;
    private int swimDistance;
    private double jumpDistance;

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }

    public double getJumpDistance() {
        return jumpDistance;
    }

    public void setJumpDistance(double jumpDistance) {
        this.jumpDistance = jumpDistance;
    }

    public void run(int distance) {
        if (runDistance > distance) {
            System.out.println("Может пробежать " + distance + " метров");
        }
        else {
            System.out.println("Не может пробежать " + distance + " метров");
        }
    }

    public void jump(double distance){
        if (jumpDistance > distance) {
            System.out.println("Может перепрыгнуть претятствие " + distance + " метров");
        }
        else {
            System.out.println("Не может перепрыгнуть претятствие " + distance + " метров");
        }
    }

    public void swim(int distance){
        if (swimDistance > distance) {
            System.out.println("Может проплыть " + distance + " метров");
        }
        else {
            System.out.println("Не может проплыть " + distance + " метров");
        }
    }
}
