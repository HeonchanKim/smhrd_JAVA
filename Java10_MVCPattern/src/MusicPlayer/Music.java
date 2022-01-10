package MusicPlayer;

public class Music {
	
	// mp3 데이터
	// 노래제목 -> title
	// 가수이름 -> singer
	// 재생시간 -> playTime
	// getter
	// 생성자 메서드
	// 접근제한하 -> private
	
	private String title;
	private String singer;
	private int playTime;
	//경로에대한 데이터 넣어주기
	private String path;
	
	public Music(String title, String singer, int playTime, String path) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public int getPlayTime() {
		return playTime;
	}
}
