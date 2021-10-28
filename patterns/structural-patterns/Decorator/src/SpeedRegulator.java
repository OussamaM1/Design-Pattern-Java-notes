public class SpeedRegulator extends CarDecorator {

    public SpeedRegulator(Car car) {
        super(car);
    }

    @Override
    public double cost() {
        return car.cost() + 200;
    }

}
