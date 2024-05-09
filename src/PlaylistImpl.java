import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl implements Playlist {
    private List<Song> songs;

    public PlaylistImpl() {
        this.songs = new ArrayList<>();
    }

    @Override
    public Iterator createIterator() {
        return new PlaylistIterator(songs);
    }

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }
}
