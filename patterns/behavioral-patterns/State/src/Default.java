public class Default implements WritingState {

    @Override
    public String write(String words) {
        return words.trim();
    }

}
