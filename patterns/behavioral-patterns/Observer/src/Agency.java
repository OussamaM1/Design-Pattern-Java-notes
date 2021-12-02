import java.nio.channels.Channel;

public interface Agency {

    void addObserver(Channel channel);

    void removeObserver(Channel channel);

    void setNews(String news);
}