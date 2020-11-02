package assessment;

//Song.java
/*Songs instantiable class*/

public class Song {
    private int trackID;
    private int trackNumber;
    private String title;
    private String artist;
    private String genre;
    private int duration;
    private int releaseYear;

    public Song(String title, String artist, String genre, int duration, int releaseYear) {
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setDuration(duration);
        setReleaseYear(releaseYear);
    }

    public int getTrackID() {
        return trackID;
    }

    public void setTrackID(int trackID) {
        this.trackID = trackID;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    private void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }


    public String toString() {
        return  "Track Number : " + getTrackNumber() +
                " Title : " + getTitle()  +
                " Artist : " + getArtist() + "\n";

    }


    public String toString2() { //This is for the suffled playlist one
        return " TrackNumber : " + getTrackNumber() +
                " Title: " + getTitle() +
                " Artist : " + getArtist() +
                " Genre: " + getGenre() +
                " ReleaseYear: " + getReleaseYear() +
                " Duration: " + getDuration() + "\n";
    }
}
