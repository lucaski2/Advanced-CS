
public class Song
{
    public String name;
    public String artist;
    public String album;

    public Song(String name, String artist, String album)
    {
        this.name = name;
        this.artist = artist;
        this.album = album;
    }
    
    public String toString()
    {
        return name + " by " + artist + " (" + year + ")";
    }

    public String getName()
    {
        return name;
    }

    public String getArtist()
    {
        return artist;
    }

    public String getAlbum()
    {
        return album;
    }

    @Override
    public boolean equals(Object obj)
    {
        Song other = (Song) obj;
        return name.equals(other.name) && artist.equals(other.artist) && ;
    }
}