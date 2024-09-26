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
            System.out.println("1. Display all the names and corresponding company info");
            System.out.println("2. Change the stock price of a company");
            System.out.println("3. Add a new company");
            System.out.println("4. Replace a company with another company");
            System.out.println("5. Quit");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option)
            {
                case 1:
                    for (Pair<Employee, Company> pair : myList)
                    {
                        System.out.println(pair.toString());
                    }
                    break;
                case 2:
                    System.out.println("Enter the name of the company you want to change the stock price of:");
                    String companyName = scanner.nextLine();
                    System.out.println("Enter the new stock price:");
                    double newStockPrice = scanner.nextDouble();
                    for (Company company : companies)
                    {
                        if (company.getName().equals(companyName))
                        {
                            company.setStockPrice(newStockPrice);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the name of the new company:");
                    String newCompanyName = scanner.nextLine();
                    System.out.println("Enter the stock price of the new company:");
                    double newStockPrice = scanner.nextDouble();
                    companies.add(new Company(newCompanyName, newStockPrice));
                    break;
                case 4:
                    System.out.println("Enter the name of the employee you want to replace the company of:");
                    String employeeName = scanner.nextLine();
                    System.out.println("Enter the name of the new company:");
                    String newCompanyName = scanner.nextLine();
                    for (Pair<Employee, Company> pair : myList)
                    {
                        if (pair.getEmployee().getName().equals(employeeName))
                        {
                            for (Company company : companies)
                            {
                                if (company.getName().equals(newCompanyName))
                                {
                                    pair.setCompany(company);
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