
public class Runner
{
    public static void main(String[] args) {
        SLList<Student> students = new SLList<Student>();
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 3));
        students.add(new Student("David", 4));
        students.add(new Student("Eve", 5));

        //In a loop, ask the user for the following.
	1. Display List. (Use the toString of the SLList class).
	2. Ask the user to add a new student at an index location.
	3. Ask the user for an index location to remove.
	4. Ask the user to remove by id. (Use the remove(Object) method.) (Hint: Create a new student 
	with any name but with the id given.  Then pass that object into the remove(Object) method. )
	5. Sort by student name.
	6. Scramble.
	7. Quit.

    }
}