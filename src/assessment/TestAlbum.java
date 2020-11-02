package assessment;

//TestAlbum
/*Driver for Album*/


import javax.swing.*;
import java.awt.*;


public class TestAlbum {
    public static void main(String[] args) {


        Song s1 = new Song("Sugar Baby Love","Rubettes", "Pop", 136, 1977);
        Song s2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
        Song s3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);
        Song s4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);
        Song s5 = new Song("House of Fun", "Madness", "Pop", 178, 1984);


        Song songArray[] = new Song[5];

        songArray[0]=s1;
        songArray[1]=s2;
        songArray[2]=s3;
        songArray[3]=s4;
        songArray[4]=s5;



        Album Album1 = new Album("Now that’s what I call music 98", songArray,"Universal Music", 2016);

        if(Album1!=null)
        {
            JTextArea textArea = new JTextArea();

            Font textFont = new Font("monospaced", Font.PLAIN, 12);
            textArea.setFont(textFont);
            textArea.append(String.format("%10s", textArea));

            String text = Album1.toString();

            for(int i = 0; i< songArray.length; i++)
            {
                text+=songArray[i];


            }
            JOptionPane.showMessageDialog(null, text, "Album Information",
                    JOptionPane.INFORMATION_MESSAGE);
        }






        if(Album1!=null)
        {
            String TrackNo;
            TrackNo = JOptionPane.showInputDialog("Which track number would you like to play?");




       // while(TrackNo!=0 && TrackNo !> songArray.length) {
        //    String song;

         //   if (TrackNo.equals(1))
          //      song = songArray[0];
          //  else if (TrackNo.equals(2))
          //      song = songArray[1];
          //  else if (TrackNo.equals(3))
           //     song = songArray[2];
          //  else if (TrackNo.equals(4))
           //     song = songArray[3];
           // else if (TrackNo.equals(5))
             //   song = songArray[4];
       // }
    }

        JOptionPane.showMessageDialog(null, "Now Playing track - details are as follows: \n\n" /*+ song */, "Playing Track",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showConfirmDialog(null, "Do you wish to shuffle the playlist? \n\n", "Shuffle Tracks",
                JOptionPane.YES_NO_OPTION);

        if(JOptionPane.YES_NO_OPTION == JOptionPane.YES_OPTION)
        {

            JOptionPane.showMessageDialog(null, "Shuffled Playlist is as follows: \n\n"  /* + Album1.shuffle()*/, "Shuffled Playlist",
                JOptionPane.INFORMATION_MESSAGE);
         }
        else
            System.exit(0);
}
}
