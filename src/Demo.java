interface Playable {
    void play();
    void stop();
    void pause();
    void skip(int seconds);
}

class Mp3File implements Playable {
	
	private String fileName;
	
	public Mp3File(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void play() {
        // Play the MP3 file
		System.out.println("Playing "+fileName+" ....");
    }

	@Override
    public void stop() {
        // Stop playing the MP3 file
    	System.out.println("Stopped Playing "+fileName+" ....");
    }

	@Override
    public void pause() {
        // Pause the MP3 file
    	System.out.println("Paused Playing "+fileName+" ....");
    }

	@Override
    public void skip(int seconds) {
        // Skip the MP3 file forward by the specified number of seconds
    	System.out.println(fileName+" forwarded with "+seconds+" ....");
    }
}

class WavFile implements Playable {
	
	private String fileName;
	
	
	public WavFile(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
    public void play() {
        // Play the WAV file
    	System.out.println("Playing "+fileName+" ....");
    }

	@Override
    public void stop() {
        // Stop playing the WAV file
    	System.out.println("Stopped Playing "+fileName+" ....");
    }

	@Override
    public void pause() {
        // Pause the WAV file
    	System.out.println("Paused Playing "+fileName+" ....");
    }

	@Override
    public void skip(int seconds) {
        // Skip the WAV file forward by the specified number of seconds
    	System.out.println(fileName+" forwarded with "+seconds+" ....");
    }
}

class FlacFile implements Playable {
	
	private String fileName;
	
	public FlacFile(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
    public void play() {
        // Play the FLAC file
    	System.out.println("Playing "+fileName+" ....");
    }
	
	@Override
    public void stop() {
        // Stop playing the FLAC file
    	System.out.println("Stopped Playing "+fileName+" ....");
    }

	@Override
    public void pause() {
        // Pause the FLAC file
    	System.out.println("Paused Playing "+fileName+" ....");
    }

	@Override
    public void skip(int seconds) {
        // Skip the FLAC file forward by the specified number of seconds
    	System.out.println(fileName+" forwarded with "+seconds+"....");
    }
}


class MusicPlayer {
    public void play(Playable file) {
        file.play();
    }

    public void pause(Playable file) {
        file.pause();
    }

    public void stop(Playable file) {
        file.stop();
    }

    public void skip(Playable file, int seconds) {
        file.skip(seconds);
    }
}


public class Demo {
	public static void main(String[] args) {
		
		//Can create reference object of interface.
		Playable p = new Mp3File("song.mp3"); 
		
		//Can create object of class implementing it.
		WavFile wavFile= new WavFile("song2.wav");
	
		
		MusicPlayer player = new MusicPlayer();
		
		player.play(p);
		player.pause(p);
		player.skip(p, 200);
		player.play(p);
		player.stop(p);
		
		System.out.print("\n");
		
		player.play(wavFile);
		player.pause(wavFile);
		player.skip(wavFile, 200);
		player.play(wavFile);
		player.stop(wavFile);
	}
}
