public class NewsChannel implements Channel {

    private String news;

    @Override
    public void update(String news) {
        this.news = news;
    }

    public String getNews() {
        return this.news;
    }

}