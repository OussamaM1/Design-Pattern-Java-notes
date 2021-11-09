public class RemoteController {

    public String submit(Command command) {
        return command.execute();
    }

}
