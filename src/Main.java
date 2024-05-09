public class Main {
    public static void main(String[] args) {
        Playlist playlist = new PlaylistImpl();

        playlist.addSong(new Song("Bohemian Rhapsody", "Queen"));
        playlist.addSong(new Song("Hotel California", "Eagles"));
        playlist.addSong(new Song("Stairway to Heaven", "Led Zeppelin"));
        playlist.addSong(new Song("Sweet Child O' Mine", "Guns N' Roses"));
        playlist.addSong(new Song("Smells Like Teen Spirit", "Nirvana"));

        System.out.println("Your Playlist:");
        Iterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println(song.getTitle() + " - " + song.getArtist());
        }

        System.out.println("\nPlaying songs:");
        playSongs(playlist);
    }

    private static void playSongs(Playlist playlist) {
        Iterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Now playing: " + song.getTitle());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Playlist finished.");
    }
}
