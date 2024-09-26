
public class Song
{
    private String artistName;
    private String songName;

    public Song(String artistName, String songName)
    {
        this.artistName = artistName;
        this.songName = songName;
    }

    public String getArtistName()
    {
        return artistName;
    }
    public String getSongName()
    {
        return songName;
    }

    public String toString()
    {
        return artistName + " - " + songName;
    }
    
}