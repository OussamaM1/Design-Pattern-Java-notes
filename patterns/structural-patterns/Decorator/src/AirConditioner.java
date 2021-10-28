public class AirConditioner extends CarDecorator {

    public AirConditioner(Car car) {
        super(car);
    }

    @Override
    public double cost() {
        return car.cost() + 400;
    }
}
