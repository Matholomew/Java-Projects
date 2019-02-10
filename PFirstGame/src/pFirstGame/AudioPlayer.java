package pFirstGame;

import java.util.HashMap;
import java.util.Map;

import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;

public class AudioPlayer {

	
	public static Map<String, Sound> soundMap = new HashMap<String, Sound>(); 
	public static Map<String, Music> musicMap = new HashMap<String, Music>();
	
	public static void load() {
		try {
			soundMap.put("mouse_click", new Sound("res/mouseClick.wav"));
			
			musicMap.put("music", new Music("res/backgroundTheme.ogg"));
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Music getMusic(String key) {
		return musicMap.get(key);
	}
	
	public static Sound getSound(String key) {
		return soundMap.get(key);
	}
}
