import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tempId, tempName, tempEmail, tempPhoneNumber; //Temp values for creating Customer objs
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        System.out.println("Please enter Customer Info >");

        System.out.print("Customer ID: ");
        tempId = scanner.nextLine();

        System.out.print("Customer Name: ");
        tempName = scanner.nextLine();

        System.out.print("Customer Email: ");
        tempEmail = scanner.nextLine();

        System.out.print("Customer Phone Number: ");
        tempPhoneNumber = scanner.nextLine();

        Customer tempCustomer = new Customer(tempId, tempName, tempEmail, tempPhoneNumber);
        customerList.add(tempCustomer);

        System.out.println("Customer List:");
        for(Customer customer : customerList){
            System.out.println(customer.toString());
        }
    }
}