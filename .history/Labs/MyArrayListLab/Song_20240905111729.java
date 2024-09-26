
public class Song
{
    public String name;
    public String artist;
    public int year;

    public Song(String name, String artist, int year)
    {
        this.name = name;
        this.artist = artist;
        this.year = year;
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

    

    @Override
    public boolean equals(Object obj)
    {
        Song other = (Song) obj;
        return name.equals(other.name) && artist.equals(other.artist) && year == other.year;
    }

}