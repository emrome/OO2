package ar.edu.unlp.info.oo2.ejericicio3_mediaPlayer;

public class Main {
	public static void main(String[]args) {
		
		VideoStream videoStream = new VideoStream();
		VideoStreamAdapter videoAd = new VideoStreamAdapter(videoStream);
		
		Audio audio = new Audio(); 
		VideoFile videoFile = new VideoFile();
		
		MediaPlayer player = new MediaPlayer();
		
		player.addMedia(videoFile);
		player.addMedia(videoAd);
		player.addMedia(audio);		
		System.out.println(player.playMedia());
	}
}
