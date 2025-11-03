import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tempId, tempName, tempEmail, tempPhoneNumber; //Temp values for creating Customer objs
        String menuOption; //Used as input from user for switch loop, decides what feature is being used
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        boolean flag = true; //Used to control menu loop
        int custIdFound = 0; //Used for an if statement in the Update Customer feature

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

                    for(Customer customer : customerList){ //This loop checks if the ID is already used, prompts a new one until a different ID is entered
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

                case "2": //Update Customer
                    custIdFound = 0; //Resets this variable for use in this feature
                    System.out.println("Enter customer ID: ");
                    tempId = scanner.nextLine();
                    for(Customer customer : customerList){ //Checking if ID is contained in the objects in the Customer List
                        if(tempId.equals(customer.getCustomerId())){
                            custIdFound = 1;
                            System.out.println("Customer found, please enter updated details: ");

                            System.out.print("Customer Name: ");
                            tempName = scanner.nextLine();

                            System.out.print("Customer Email: ");
                            tempEmail = scanner.nextLine();

                            System.out.print("Customer Phone Number: ");
                            tempPhoneNumber = scanner.nextLine();

                            for(Customer Customer : customerList){ //Another loop using the ID to find the customer details to change
                                if(tempId.equals(Customer.getCustomerId())){
                                    customer.setName(tempName);
                                    customer.setEmail(tempEmail);
                                    customer.setPhoneNumber(tempPhoneNumber);
                                }
                            }
                        }
                    }
                    if(custIdFound == 0){ //ID does not match any object in List
                        System.out.println("Customer not found");
                    }
                    break;

                case "3": //Display Customers in List
                    System.out.println("Customer List:");
                    for (Customer customer : customerList) {
                        System.out.println(customer.toString());
                    }
                    break;

                case "4": //Exit
                    flag = false;
                    break;
            }
        }
    }
}