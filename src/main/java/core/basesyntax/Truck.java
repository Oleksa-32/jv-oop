package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started its work");
    }

    @Override
    void stopWork() {
        System.out.println("Truck stopped its work");
    }
}
