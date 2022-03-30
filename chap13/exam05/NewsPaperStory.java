package exam05;

class NewsPaper { // 회사
	String todayNews;
	
	public void setTodayNews(String news) { // 기자가 회사에 전송
		todayNews = news;
	}
	
	public String getTodayNews() { // 독자가 요청하면 보내준다
		return todayNews;
	}
}

class NewsWriter extends Thread { // 기자
	NewsPaper paper;
	
	public NewsWriter(NewsPaper paper) {
		this.paper=paper;
	}
	public void run() {
		paper.setTodayNews("자바의 열기가 뜨겁습니다.");
	}
}

class NewsReader extends Thread { // 독자
	NewsPaper paper;
	
	public NewsReader(NewsPaper paper) {
		this.paper=paper;
	}
	public void run() {
		System.out.println("오늘의 뉴스: " + paper.getTodayNews());
	}
}

class NewsPaperStory {
	public static void main(String[] args) {
		NewsPaper paper = new NewsPaper();
		NewsReader reader = new NewsReader(paper);
		NewsWriter writer = new NewsWriter(paper);

		writer.start();
		reader.start();
		

		try {
			reader.join();
			writer.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}