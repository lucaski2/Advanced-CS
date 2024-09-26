
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
    

}