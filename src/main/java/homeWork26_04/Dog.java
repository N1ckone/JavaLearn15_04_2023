package homeWork26_04;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
        setDistanceRunLimit((int) (400 + Math.random() * 200));
        setHeightJumpLimit(0.2 + Math.random());
        setDistanceSwimLimit((int) (7 + Math.random() * 10));
    }

    @Override
    public void run(int distance) {
        boolean isDogReadyToRun = distance < getDistanceRunLimit();
        System.out.println(isDogReadyToRun);
    }

    @Override
    public void swim(int distance) {
    boolean isDogReadyToSwim = distance < getDistanceSwimLimit();
    System.out.println(isDogReadyToSwim);

    }

    @Override
    public void jump(double height) {
        boolean isDogReadyToJump = height < getHeightJumpLimit();
        System.out.println(isDogReadyToJump);
    }


}
