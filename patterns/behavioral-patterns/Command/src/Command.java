public interface Command {

    public String execute();

    public String undo();

    public String redo();

}
