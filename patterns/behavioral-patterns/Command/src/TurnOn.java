public class TurnOn implements Command {

    protected Bulb bulb;

    public TurnOn(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public String execute() {
        return bulb.turnOn();
    }

    @Override
    public String undo() {
        return bulb.turnOff();
    }

    @Override
    public String redo() {
        return this.execute();
    }

}
