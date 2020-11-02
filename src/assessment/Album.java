package assessment;

//Album.java
/* Album for songs */

import javax.swing.*;
import java.util.Arrays;

public class Album {
    private String name;
    private Song[] tracks;
    private String producer;
    private int releaseYear;

    public Album(String name, Song[] tracks, String producer, int releaseYear) {
        setName(name);
        setTracks(tracks);
        setProducer(producer);
        setReleaseYear(releaseYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(this.name == "" || this.name == null)
          this.name = "No name specified";

        else
        this.name = name;

    }

    public Song[] getTracks() {
        return tracks;
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getNumberOfTracks()
    {
        int totalTracks=0;
        for(int i =0; i<tracks.length; i++)
           if(tracks[i] != null)
             totalTracks++;

       return totalTracks;
    }

    public int getPlayingTime()
    {
       // int totalPlayingTime=0;

       // for(int i = 0; i<tracks.getDuration(); i++)
        //    if(tracks[i] != null)
         //     tracks[i].getDuration() += totalPlayingTime;
        //
        // return totalPlayingTime;

                return 0;



    }

    public void playTrack(int TrackNo)
    {
        if(TrackNo < 1 || TrackNo > tracks.length)
            JOptionPane.showMessageDialog(null, "An invalid track " +
                "number was supplied!", "Bad Track Number", JOptionPane.ERROR_MESSAGE);

        else
            JOptionPane.showMessageDialog(null, "Now Playing track - details are as follows: \n\n", "Playing Track",
                    JOptionPane.INFORMATION_MESSAGE);

    }

    public void shuffle()
    {
        Song songArray[] = new Song[tracks.length];
        //Math.random(0,songArray.length);

    }


    public String toString() {
        return "Name: " + getName()  + "\n\n" +

                "Producer : " + getProducer()  + "\n\n" +
                "ReleaseYear : " + getReleaseYear() + "\n\n" +
                "Number of Tracks: " + getNumberOfTracks() + "\n\n" +
                "Total Playing Time: " + getPlayingTime() + "\n\n" +
                 "Tracks : " + getTracks() + "\n\n";
    }

}
