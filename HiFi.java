package player;

public class HiFi {
    public static void main(String[] args) {

        Song[] library = new Song[3];
        library[0] = new Song("Michael Jackson", "Beat It", "Thriller", 1992);
        library[1] = new Song("Metalica", "Nothing els metter", "The best of", 1982);
        library[2] = new Song("LaoChe", "Wojenka", "Powstanie", 2000);


       Player[] players = {new CDPlayer(library), new MP3Player(library)};

       players[0].play();
       players[0].pause();
       players[0].next();
       players[0].next();
       players[0].stop();
       players[0].next();
        players[0].play();
       players[0].next();

       System.out.println();

       players[1].play();
       players[1].stop();
       players[1].pause();
       }

    }

