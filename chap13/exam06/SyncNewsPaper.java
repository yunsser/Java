package exam06;

class NewsPaper {
	String todayNews;
	boolean isTodayNews = false;
	
	public void setTodayNews(String news) {
		todayNews = news;
		isTodayNews = true;
		
		synchronized(this) {
			notifyAll(); // wait에 기능을 깨워주는 역활 // wait에 있던 정보가 리턴해온다
		}
	}
	
	public String getTodayNews() {
		
		if(isTodayNews == false) {
			try {
				synchronized(this) {
					wait(); // 기자가 기사를 보내왔을때 일어난다 // join 내가 바라보고있는 쓰레드가 끝날때 일어난다 // sleep시간이 지난 후 일어난다
				}
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return todayNews;
	}
}

class NewsWriter extends Thread {
	NewsPaper paper;
	
	public NewsWriter(NewsPaper paper) {
		this.paper=paper;
	}
	public void run() {
		paper.setTodayNews("자바의 열기가 뜨겁습니다.");
	}
}

class NewsReader extends Thread {
	NewsPaper paper;
	
	public NewsReader(NewsPaper paper) {
		this.paper=paper;
	}
	public void run() {
		System.out.println("오늘의 뉴스: " + paper.getTodayNews());
	}
}

class SyncNewsPaper {
	public static void main(String[] args) {
		NewsPaper paper=new NewsPaper();
		NewsReader reader1=new NewsReader(paper);
		NewsReader reader2=new NewsReader(paper);
		NewsWriter writer=new NewsWriter(paper);

		try {
			reader1.start();
			reader2.start();
			
			Thread.sleep(1000);			
			writer.start();
	
			reader1.join();
			reader2.join();
			writer.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}