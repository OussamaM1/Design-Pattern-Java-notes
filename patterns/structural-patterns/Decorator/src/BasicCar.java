public class BasicCar extends Car {

    public BasicCar() {
        description = "BasicCar";
    }

    @Override
    public double cost() {
        return 1000;
    }

}
