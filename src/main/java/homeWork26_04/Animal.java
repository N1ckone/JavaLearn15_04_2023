package homeWork26_04;

public abstract class Animal {

    private String name;
    private int distanceRunLimit;
    private double heightJumpLimit;
    private int distanceSwimLimit;


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public abstract void jump(double height);

    public void setDistanceRunLimit(int distanceRunLimit) {
        this.distanceRunLimit = distanceRunLimit;
    }

    public void setHeightJumpLimit(double heightJumpLimit) {
        this.heightJumpLimit = heightJumpLimit;
    }

    public void setDistanceSwimLimit(int distanceSwimLimit) {
        this.distanceSwimLimit = distanceSwimLimit;
    }

    public int getDistanceRunLimit() {
        return distanceRunLimit;
    }

    public double getHeightJumpLimit() {
        return heightJumpLimit;
    }

    public int getDistanceSwimLimit() {
        return distanceSwimLimit;
    }
}
