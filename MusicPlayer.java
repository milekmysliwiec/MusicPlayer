package player;

abstract public class MusicPlayer implements Player {

    private Song[] library;
    private int current;
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public MusicPlayer(Song[] library) {
        this.current = 0;
        this.library = library;
        this.status = 0;

    }

    public Song getCurrentSong() {
        return library[current];
    }

    @Override
    public void previous() {
        if (--current < 0 ){
            current = library.length - 1;
        }
        if (getStatus() !=1) {
            play();
        }
    }

    @Override
    public void next() {
        if (++current>= library.length) {
            current = 0;
        }
        if (getStatus() != 1) {
            play();
        }




    }
}
