
public class Runner
{
    public static void main(String[] args) {
        SLList<Student> students = new SLList<Student>();

        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 3));
        students.add(new Student("David", 4));
        students.add(new Student("Eve

        while (true) {
            System.out.println("1. Display List");
            System.out.println("2. Add a new student at an index location");
            System.out.println("3. Remove by index location");
            System.out.println("4. Remove by id");
            System.out.println("5. Sort by student name");
            System.out.println("6. Scramble");
            System.out.println("7. Quit");
            System.out.print("Enter a number: ");
            int choice = Integer.parseInt(System.console().readLine());
            switch (choice) {
                case 1:
                    System.out.println(students);
                    break;
                case 2:
                    System.out.print("Enter a name: ");
                    String name = System.console().readLine();
                    System.out.print("Enter an id: ");
                    int id = Integer.parseInt(System.console().readLine());
                    System.out.print("Enter an index: ");
                    int index = Integer.parseInt(System.console().readLine());
                    students.add(new Student(name, id), index);
                    break;
                case 3:
                    System.out.print("Enter an index: ");
                    index = Integer.parseInt(System.console().readLine());
                    students.remove(index);
                    break;
                case 4:
                    System.out.print("Enter an id: ");
                    id = Integer.parseInt(System.console().readLine());
                    students.remove(new Student("dummy", id));
                    break;
                case 5:
                    students.sort();
                    break;
                case 6:
                    students.scramble();
                    break;
                case 7:
                    return;
            }
        }

    }
}