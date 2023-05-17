package ar.edu.unlp.info.oo2.ejericicio3_mediaPlayer;

public class VideoStreamAdapter extends Media{
	
	private VideoStream adaptee;
	
	public VideoStreamAdapter (VideoStream adaptee) {
		this.adaptee = adaptee;
	}
	
	public String play() {
		return this.adaptee.reproduce();
	}
}
