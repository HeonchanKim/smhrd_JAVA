package MusicPlayer;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class Controller {
	// static�� mp3����� �־�����
	static MP3Player mp3 = new MP3Player();
	public static void main(String[] args) {

	}
	
	public static void play(ArrayList<Music> list, int index) {
		//4. �뷡�� �����Ű��
		mp3.play(list.get(index).getPath());		
	}
	public static void stop() {
		if(mp3.isPlaying()) {
			mp3.stop();			
		}
	}
}
