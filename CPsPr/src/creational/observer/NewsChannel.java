package creational.observer;

/*
 * Observer class.
 */
public class NewsChannel implements Channel {
	public String news;
	
	@Override
	public void update(Object news) {
		this.setNews((String) news);
	}

	private void setNews(String news2) {
		this.news = news2;
	}

	public String getNews() {
		return this.news;
	}
}
