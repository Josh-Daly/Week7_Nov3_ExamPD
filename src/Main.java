import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tempId, tempName, tempEmail, tempPhoneNumber, menuOption; //Temp values for creating Customer objs
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        boolean flag = true;
        int custIdFound = 0;

        while(flag){
            System.out.println("~~~Customer Management Menu~~~");
            System.out.println("1) Add Customer");
            System.out.println("2) Update Customer");
            System.out.println("3) Display Customers");
            System.out.println("4) Exit");
            menuOption = scanner.nextLine();
            switch (menuOption){
                case "1": //Add Customer
                    System.out.println("Please enter Customer Info >");

                    System.out.print("Customer ID: ");
                    tempId = scanner.nextLine();

                    for(Customer customer : customerList){
                        while(tempId.equals(customer.getCustomerId())){
                            System.out.println("ID already in system, enter a new ID: ");
                            tempId = scanner.nextLine();
                        }
                    }
                    System.out.print("Customer Name: ");
                    tempName = scanner.nextLine();

                    System.out.print("Customer Email: ");
                    tempEmail = scanner.nextLine();

                    System.out.print("Customer Phone Number: ");
                    tempPhoneNumber = scanner.nextLine();

                    Customer tempCustomer = new Customer(tempId, tempName, tempEmail, tempPhoneNumber);
                    customerList.add(tempCustomer);
                    break;

                case "2":
                    custIdFound = 0;
                    System.out.println("Enter customer ID: ");
                    tempId = scanner.nextLine();
                    for(Customer customer : customerList){
                        if(tempId.equals(customer.getCustomerId())){
                            custIdFound = 1;
                            System.out.println("Customer found, please enter updated details: ");

                            System.out.print("Customer Name: ");
                            tempName = scanner.nextLine();

                            System.out.print("Customer Email: ");
                            tempEmail = scanner.nextLine();

                            System.out.print("Customer Phone Number: ");
                            tempPhoneNumber = scanner.nextLine();

                            for(Customer Customer : customerList){
                                if(tempId.equals(Customer.getCustomerId())){
                                    customer.setName(tempName);
                                    customer.setEmail(tempEmail);
                                    customer.setPhoneNumber(tempPhoneNumber);
                                }
                            }
                        }
                    }
                    if(custIdFound == 0){
                        System.out.println("Customer not found");
                    }
                    break;

                case "3":
                    System.out.println("Customer List:");
                    for (Customer customer : customerList) {
                        System.out.println(customer.toString());
                    }
                    break;

                case "4":
                    flag = false;
                    break;
            }
        }
    }
}