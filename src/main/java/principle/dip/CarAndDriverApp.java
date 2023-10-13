package principle.dip;

public class CarAndDriverApp {
    public static void main(String[] args) throws Exception {
        Driver driver = new DefaultDriver();
        Car car = new Benz();
        driver.setCar(car);
        driver.drive();
        car = new Bmw();
        driver.setCar(car);
        driver.drive();
    }
}

interface Driver {

    void drive();

    void setCar(Car car);
}

interface Car {

    void run();
}

class DefaultDriver implements Driver {

    private Car car;

    @Override
    public void drive() {
        car.run();
    }

    @Override
    public void setCar(Car car) {
        this.car = car;
    }
}

class Bmw implements Car {

    @Override
    public void run() {
        System.out.println("Bmw runs...");
    }
}

class Benz implements Car {

    @Override
    public void run() {
        System.out.println("Benz runs...");
    }
}