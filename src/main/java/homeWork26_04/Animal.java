package homeWork26_04;

<<<<<<< HEAD
import java.util.Objects;

public abstract class Animal implements Cloneable {
=======
public abstract class Animal {
>>>>>>> 96998974014d7e4c7cf615e92ce1b4ef174d3362

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
<<<<<<< HEAD

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (distanceRunLimit != animal.distanceRunLimit) return false;
        if (Double.compare(animal.heightJumpLimit, heightJumpLimit) != 0) return false;
        if (distanceSwimLimit != animal.distanceSwimLimit) return false;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + distanceRunLimit;
        temp = Double.doubleToLongBits(heightJumpLimit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + distanceSwimLimit;
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
=======
>>>>>>> 96998974014d7e4c7cf615e92ce1b4ef174d3362
}
