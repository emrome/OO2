package ar.edu.unlp.info.oo2.ejericicio3_mediaPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MediaPlayer {

	private List<Media> media;
	

	public MediaPlayer() {
		this.media = new ArrayList<Media>();
	}
	
	public String playMedia() {
		return this.media.stream().map(Media::play).collect(Collectors.joining(" , "));
	}
	
	public List<Media> getMedia(){
		return this.media;
	}
	
	public void addMedia(Media media) {
		this.media.add(media);
	}
}
