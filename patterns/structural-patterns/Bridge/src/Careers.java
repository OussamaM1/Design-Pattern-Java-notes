public class Careers extends WebPage {

    public Careers(Theme theme) {
        super(theme);
    }

    @Override
    public void getContent() {
        System.out.println("Careers page in " + theme.getColor());
    }

}