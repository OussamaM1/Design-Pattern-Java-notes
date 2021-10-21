public class TextEditor {
    private WritingState state;

    // Constructor
    public TextEditor(WritingState state) {
        this.state = state;
    }

    // state setter
    public void setState(WritingState state) {
        this.state = state;
    }

    // the request method
    public String request(String words) {
        return this.state.write(words);
    }

}