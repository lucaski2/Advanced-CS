import java.util.Scanner;
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

        while (true)
        {
            System.out.println("1. Add a new song.");
            System.out.println("2. Display song list.");
            System.out.println("3. Delete a song given an artist name and song name.");
            System.out.println("4. Delete a song by number on the playlist.");
            System.out.println("5. Delete songs by artist.");
            System.out.println("6. Delete songs by name.");
            System.out.println("7. Sort by artist name.");
            System.out.println("8. Sort by song name.");
            System.out.println("9. Search by artist.");
            System.out.println("10. Clear the list.");
            System.out.println("11. Quit.");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1)
            {
                System.out.println("Enter the artist name:");
                String artistName = sc.nextLine();
                System.out.println("Enter the song name:");
                String songName = sc.nextLine();
                lst.add(new Song(artistName, songName));
            }
            else if (choice == 2)
            {
                for (int i = 0; i < lst.size(); i++)
                {
                    System.out.println((i + 1) + ". " + lst.get(i));
                }
            }
            else if (choice == 3)
            {
                System.out.println("Enter the artist name:");
                String artistName = sc.nextLine();
                System.out.println("Enter the song name:");
                String songName = sc.nextLine();
                lst.remove(new Song(artistName, songName));
            }
            else if (choice == 4)
            {
                System.out.println("Enter the number of the song you want to delete:");
                int num = sc.nextInt();
                lst.remove(num - 1);
            }
            else if (choice == 5)
            {
                System.out.println("Enter the artist name:");
                String artistName = sc.nextLine();
                for (int i = 0; i < lst.size(); i++)
                {
                    if (lst.get(i).getArtistName().equals(artistName))
                    {
                        lst.remove(i);
                        i--;
                    }
                }
            }
            else if (choice == 6)
            {
                System.out.println("Enter the song name:");
                String songName = sc.nextLine();
                for (int i = 0; i < lst.size(); i++)
                {
                    if (lst.get(i).getSongName().equals(songName))
                    {
                        lst.remove(i);
                        i--;
                    }
                }
            }

            


    }
}