import java.util.Scanner;
abstract class BankDetails{
    String cunstomer_id;
    String customer_name;
    float curr_loan_amt=0.0f;
    String phn_number;
    static float credit_amt=0.0f;
}
class Customer extends BankDetails{
    Customer(){
        final Scanner sc=new Scanner(System.in);
        System.out.print("Enter fixed amount :");//COMMON FOR ALL CONSTUMERS.
        credit_amt=sc.nextLine();
    }
    // static takeAmt(){
    //     final Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter fixed amount :");//COMMON FOR ALL CONSTUMERS.
    //     credit_amt=sc.nextLine();
    // }
    void getDetails(){
        final Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of the customer : ");
        customer_name=sc.nextLine();
        System.out.print("Enter id of the customer : ");
        customer_id=sc.nextLine();
        System.out.print("Enter phone-number of the customer : ");
        phn_number=sc.nextLine();
    }
    public String getName(){
        return customer_name;
    }
    void availLoan(){
        float loan;
        final Scanner sc=new Scanner(System.in);
        System.out.print("Enter loan amount : ");
        loan = Float.parseFloat(sc.nextLine());//WRAPPER CLASS
        if((loan+curr_loan_amt)<=credit_amt){
            System.out.println("Congrats!! You are elligible for the loan ");
            curr_loan_amt=curr_loan_amt+loan;
        }
        else{
            System.out.println("Sorry!! You are not elligible for the loan ");
        }
    }
}
class PrivilegedCustomer extends BankDetails{
    PrivilegedCustomer(){
        final Scanner sc=new Scanner(System.in);
        System.out.print("Enter fixed amount :");//COMMON FOR ALL PRIVILEGED CONSTUMERS.
        credit_amt=sc.nextLine();
    }
    void getDetails(){
        final Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of the privileged customer : ");
        customer_name=sc.nextLine();
        System.out.print("Enter id of the privileged customer : ");
        customer_id=sc.nextLine();
        System.out.print("Enter phone-number of the privileged customer : ");
        phn_number=sc.nextLine();
    }
    public String getName(){
        return customer_name;
    }
    void availLoan(){
        float loan;
        final Scanner sc=new Scanner(System.in);
        System.out.print("Enter loan amount(privileged customer) : ");
        loan = Float.parseFloat(sc.nextLine());//WRAPPER CLASS
        if((loan+curr_loan_amt)<=credit_amt){
            System.out.println("Congrats!! You are elligible for the loan ");
            curr_loan_amt=curr_loan_amt+loan;
        }
        else{
            System.out.println("Sorry!! You are not elligible for the loan ");
        }
    }
}
class Bank{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.prinln("Enter\n1: Create Customer\n2: Avail Loan\n3: Exit");
        System.out.print("Enter your Choice :");
        ch=sc.nextInt();
        Vector<Customer>cus =new Vector<Customer>();
        Vector<PrivilegedCustomer>pcus= new Vector<PrivilegedCustomer>();
        Customer c=new Customer();
        PrivilegedCustomer pc=new PrivilegedCustomer();
        while(ch !=5){
            if(choice == 1){
            System.out.print("Enter Details \nA: Customer\nB: Privileged Customer ");
            System.out.print("Enter choice : ");
            string choice;
            choice=sc.nextLine();
            if(choice.equals("A")){
                cus.add(c);
                System.out.println("DETAILS ADDED -:))");
            }
            else if(choice.equals("B")){
                pcus.add(pc);
                System.out.println("DETAILS ADDED -:))");
            }
            else{
                System.out.println("INVALID CHOICE ENTERED !!!! ");
            }
            }
        }
    }
}