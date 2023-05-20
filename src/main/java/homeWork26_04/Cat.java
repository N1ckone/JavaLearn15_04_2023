package homeWork26_04;

<<<<<<< HEAD
import lombok.NonNull;

=======
>>>>>>> 96998974014d7e4c7cf615e92ce1b4ef174d3362
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        setDistanceRunLimit( (int)(150 + Math.random() * 100));
        setHeightJumpLimit(1.65 + Math.random());

    }

    @Override
    public void run(int distance) {
        boolean isCatReadyToRun = distance < getDistanceRunLimit();
        System.out.println(isCatReadyToRun);
    }

    @Override
    public void swim(int distance) {
        System.out.println(false);
    }

    @Override
    public void jump(double height) {
        boolean isCatReadyToJump = height < getHeightJumpLimit();
        System.out.println(isCatReadyToJump);
    }
}
