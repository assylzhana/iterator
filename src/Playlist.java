public interface Playlist {
    Iterator createIterator();
    void addSong(Song song);
}
