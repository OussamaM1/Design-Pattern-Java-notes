import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Agency {

    private String news;
    private List<Channel> channels = new ArrayList<>();

    @Override
    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    @Override
    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }

    @Override
    public void setNews(String news) {
        this.news = news;
        for (Channel channel : this.channels) {
            channel.update(news);
        }
    }
}
