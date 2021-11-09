public class TurnOff implements Command {

    protected Bulb bulb;

    public TurnOff(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public String execute() {
        return bulb.turnOff();
    }

    @Override
    public String undo() {
        return bulb.turnOn();
    }

    @Override
    public String redo() {
        return this.execute();
    }

}
