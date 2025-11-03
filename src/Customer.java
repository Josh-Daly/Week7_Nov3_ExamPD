public class Customer {
    //Object Details
    private String customerId;
    private String name;
    private String email;
    private String phoneNumber;

    //Default Constructor
    public Customer() {
        System.out.println("Default Cust Constructor");
        this.customerId = "0";
        this.name = "John";
        this.email = "john@atu.ie";
        this.phoneNumber = "0";
    }

    //Parametrised Constructor
    public Customer(String inputId, String inputName, String inputEmail, String inputNumber){
        this.customerId = inputId;
        this.name = inputName;
        this.email = inputEmail;
        this.phoneNumber = inputNumber;
    }

    //Getters
    public String getCustomerId(){
        return customerId;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    //Setters
    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //Give info in form of a string
    public String toString(){
        return "Customer Details: " + customerId + ", " + name + ", " + email + ", " + phoneNumber + ".";
    }
}
