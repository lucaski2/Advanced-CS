import java.util.ArrayList;
import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pair<Employee, Company>> myList = new ArrayList<Pair<Employee, Company>>();
        ArrayList<Company> companies = new ArrayList<Company>();
        companies.add(new Company("Microsoft", 110.47));
        companies.add(new Company("Google", 1172.10));
        companies.add(new Company("Apple", 219.89));
        myList.add(new Pair<Employee, Company>(new Employee("John"), companies.get(0)));
        myList.add(new Pair<Employee, Company>(new Employee("Jose"), companies.get(1)));
        myList.add(new Pair<Employee, Company>(new Employee("Jennifer"), companies.get(1)));
        myList.add(new Pair<Employee, Company>(new Employee("Heather"), companies.get(2)));
        myList.add(new Pair<Employee, Company>(new Employee("Maria"), companies.get(2)));
        boolean running = true;
        while (running)
        {
            System.out.println("1. Display all employees and companies");
            System.out.println("2. Change stock price of a company");
            System.out.println("3. Add a new company");
            System.out.println("4. Replace a company for an employee");
            System.out.println("5. Quit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 1:
                    for (Pair<Employee, Company> pair : myList)
                    {
                        System.out.println(pair);
                    }
                    break;
                case 2:
                    System.out.println("Enter the name of the company you want to change the stock price of:");
                    String company = scanner.nextLine();
                    System.out.println("Enter the new stock price:");
                    double stockPrice = scanner.nextDouble();
                    scanner.nextLine();
                    for (Company c : companies)
                    {
                        if (c.getName().equals(company))
                        {
                            c.setStockPrice(stockPrice);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the name of the new company:");
                    String newCompany = scanner.nextLine();
                    System.out.println("Enter the stock price of the new company:");
                    double newStockPrice = scanner.nextDouble();
                    scanner.nextLine();
                    companies.add(new Company(newCompany, newStockPrice));
                    break;
                case 4:
                    System.out.println("Enter the name of the employee you want to replace the company of:");
                    String employee = scanner.nextLine();
                    System.out.println("Enter the name of the new company:");
                    String newCompany2 = scanner.nextLine();
                    for (Pair<Employee, Company> pair : myList)
                    {
                        if (pair.getEmployee().getName().equals(employee))
                        {
                            for (Company c : companies)
                            {
                                if (c.getName().equals(newCompany2))
                                {
                                    pair.setCompany(c);
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    running = false;
                    break;
            }
        }
    }
}