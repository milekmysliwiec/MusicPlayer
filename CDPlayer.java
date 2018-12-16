package player;

public class CDPlayer extends MusicPlayer implements Player{

    public CDPlayer(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        setStatus(1);
        System.out.println("CD odtwarza" + getCurrentSong());
    }

    @Override
    public void pause() {
        setStatus(2);
        System.out.println("CD pauza" + getCurrentSong());

    }

    @Override
    public void stop() {
        setStatus(0);
        System.out.println("CD stop");

    }




}
