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
        ArrayList<Company> companies = new ArrayList<Company>();
        companies.add(new Company("Microsoft", 110.47));
        companies.add(new Company("Google", 1172.10));
        companies.add(new Company("Apple", 219.89));
        myList.add(new Pair<Employee, Company>(new Employee("John"), companies.get(0)));
        myList.add(new Pair<Employee, Company>(new Employee("Jose"), companies.get(1)));
        myList.add(new Pair<Employee, Company>(new Employee("Jennifer"), companies.get(1)));
        myList.add(new Pair<Employee, Company>(new Employee("Heather"), companies.get(2)));
        myList.add(new Pair<Employee, Company>(new Employee("Maria"), companies.get(2)));
        


        


    }

}