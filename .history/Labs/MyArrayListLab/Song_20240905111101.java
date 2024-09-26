
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

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof Song))
        {
            return false;
        }
        Song other = (Song) obj;
        return name.equals(other.name) && artist.equals(other.artist) && year == other.year;
    }

}