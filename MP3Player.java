package player;

public class MP3Player extends MusicPlayer implements Player {


    public MP3Player(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        setStatus(1);
        System.out.println("MP3 odtwarza" + getCurrentSong());

    }

    @Override
    public void pause() {
        setStatus(2);
        System.out.println("MP3 pause" + getCurrentSong());

    }

    @Override
    public void stop() {
        setStatus(0);
        System.out.println("MP3 stop");

    }


}
