import java.util.List;
import java.util.NoSuchElementException;

public class PlaylistIterator implements Iterator {
    private List<Song> songs;
    private int position;

    public PlaylistIterator(List<Song> songs) {
        this.songs = songs;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return songs.get(position++);
    }
}
