package creational.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * This is observable class.
 * It notifies observers about changes in its state.
 */
public class NewsAgency {
	private String news;
	private List<Channel> channels = new ArrayList<>();  //references to observers.
	
	/*
	 * Add observer.
	 */
	public void addObserver(Channel channel) {
		this.channels.add(channel);
	}
	
	/*
	 * Remove observer.
	 */
	public void removeObserver(Channel channel) {
		this.channels.remove(channel);
	}
	
	/*
	 * Notify all observers(channels) for the news by calling update() method.
	 */
	public void setNews(String news) {
		this.news = news;
		for (Channel channel : this.channels) {
			channel.update(this.news);
		}
	}
}
