import java.util.ArrayList;
import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        // Your program will have a list of 5 employees and 3 different companies in an ArrayList of a Pair of Employee and Company.   
        // (e.g.  ArrayList<Pair<Employee,Company>> myList = new ….)
        // Some employees will have the same company.  For example,

        // John : Microsoft $110.47
        // Jose : Google $1172.10
        // Jennifer : Google $1172.10
        // Heather : Apple $219.89
        // Maria : Apple $219.89

        // In a loop, have 4 options.  
        // Option 1 is to use a loop to display all the names and corresponding company info of the ArrayList of Pairs using the toString() of the generic pair.  
        // Option 2 is to ask the user for a company name.  You can then change the stockPrice of that company.  That information would be reflected when you print the ArrayList of Pairs using Option 1.   
        // Option 3 is to have the ability to add a new company. (Hint: You may want to keep a list of all the companies.)
        // Option 4 is to be able to select a user and replace a company with another company.  (We will assume the user knows the company name.)
        // Option 5 is to quit.

        Scanner scanner = new Scanner(System.in);
        ArrayList<Pair<Employee, Company>> myList = new ArrayList<Pair<Employee, Company>>();
        myList.add(new Pair<Employee, Company>(new Employee("John"), new Company("Google", 1000.0)));
        myList.add(new Pair<Employee, Company>(new Employee("Jose"), new Company("Google", 1000.0)));
        myList.add(new Pair<Employee, Company>(new Employee("Jennifer"), new Company("Google", 1000.0)));
        myList.add(new Pair<Employee, Company>(new Employee("Heather"), new Company("Apple", 200.0)));
        myList.add(new Pair<Employee, Company>(new Employee("Maria"), new Company("Lyft", 200.0)));
        
        boolean running = true;
        while (running)
        {
            System.out.println("1. Display all names and corresponding company info");
            System.out.println("2. Change stock price of a company");
            System.out.println("3. Add a new company");
            System.out.println("4. Replace a company with another company");
            System.out.println("5. Quit");
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option)
            {
                case 1:
                    for (Pair<Employee, Company> pair : myList)
                    {
                        System.out.println(pair);
                    }
                    break;
                case 2:
                    System.out.print("Enter a company name: ");
                    String companyName = scanner.nextLine();
                    System.out.print("Enter the new stock price: ");
                    double stockPrice = scanner.nextDouble();
                    for (Pair<Employee, Company> pair : myList)
                    {
                        if (pair.getCompany().getName().equals(companyName))
                        {
                            pair.getCompany().setStockPrice(stockPrice);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter a company name: ");
                    String newCompanyName = scanner.nextLine();
                    System.out.print("Enter the stock price: ");
                    double newStockPrice = scanner.nextDouble();
                    myList.add(new Pair<Employee, Company>(new Employee("New Employee"), new Company(newCompanyName, newStockPrice)));
                    break;
                case 4:
                    System.out.print("Enter the name of the employee: ");
                    String employeeName = scanner.nextLine();
                    System.out.print("Enter the new company name: ");
                    String newCompany = scanner.nextLine();
                    for (Pair<Employee, Company> pair : myList)
                    {
                        if (pair.getEmployee().getName().equals(employeeName))
                        {
                            pair.setCompany(new Company(newCompany, 0.0));
                        }
                    }
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }


        


    }

}