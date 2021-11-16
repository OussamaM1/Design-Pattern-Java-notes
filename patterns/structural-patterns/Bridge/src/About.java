public class About extends WebPage {

    public About(Theme theme) {
        super(theme);
    }

    @Override
    public void getContent() {
        System.out.println("About page in " + theme.getColor());
    }

}
