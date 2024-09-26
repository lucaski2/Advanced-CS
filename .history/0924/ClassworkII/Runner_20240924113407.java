
public class Runner
{
    public static void main(String[] args) {
        DLList<Song> lst = new DLList<Song>();
        lst.add(new Song("The Beatles", "Hey Jude"));
        lst.add(new Song("The Beatles", "Let It Be"));
        lst.add(new Song("LVL", "A$AP Rocky"));
        lst.add(new Song("Sundress", "A$AP Rocky"));
        lst.add(new Song("The Beatles", "Yesterday"));

//         Create a Song List Manager using the DLList object you created.  The program will start with 5 songs of your choice with at least 2 songs having the same artists.  It will repeat indefinitely until the user quits and will ask the user for the following choice.

        // Add a new song.
        // Display song List.  The list will be numbered and displayed in the following format starting at 1.
        // 1. artist name - song name
        // 2. artist name - song name
        // ….
        // Delete a song given an artist name and song name.  You should create a new song given the artist's name and song name.  Then pass it into your remove(Object) method.
        // Delete a song by number on the playlist.
        // Delete songs by artist.  This will delete all occurrences.
        // Delete songs by name. This will delete all occurrences.
        // Sort by artist name.
        // Sort by song name.
        // Search by artist.  Display songs with only that artist. The order does not matter. The song list will be numbered and displayed in the following format starting at 1.
        // 1. artist name - song name
        // 2. artist name - song name
        // ….
        // Clear the list.
        // Quit

        Scanner sc = new Scanner(System.in);
        

    }
}