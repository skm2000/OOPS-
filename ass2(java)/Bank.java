import java.util.Scanner;
import java.util.Vector;
class Customer{
    protected String customer_id;
    protected String customer_name;
    protected float curr_loan_amt=0.0f;
    protected long phn_number;
    private float loan_amt=0.0f;
    final float credit_limit=10000.0f;
    Scanner sc=new Scanner(System.in);
    Customer(){

    }
    public String getName(){
        return customer_name;
    }
    public void setName(final String customer_name){
        this.customer_name=customer_name;
    }
    public String getId(){
        return customer_id;
    }
    public long getPhn(){
        return phn_number;
    }
    public void setPhn(long phn_number){
        this.phn_number=phn_number;
    }
    void getDetails(){
        System.out.print("Enter name of the customer : ");
        customer_name=sc.nextLine();
        System.out.print("Enter id of the customer : ");
        customer_id=sc.nextLine();
        System.out.print("Enter phone-number of the customer : ");
        phn_number=Long.parseLong(sc.nextLine());
        System.out.print("Enter loan which was taken before : ");
        curr_loan_amt=Float.parseFloat(sc.nextLine());
    }
    void availLoan(){
        System.out.print("Enter loan amount he want to avail : ");
        loan_amt=sc.nextFloat();
        if((loan_amt+curr_loan_amt)<=credit_limit){
            System.out.println("Congrats!! You are elligible for the loan.Loan Amount given ");
            loan_amt=loan_amt+curr_loan_amt;
        }
        else{
            System.out.println("Sorry!! You are not elligible for the loan ");
        }
    }
    void printDetails(){
        System.out.println("Current Amount available is : "+loan_amt);
    }
}
class PrivilegedCustomer extends Customer{
    private final float credit_limit=15000.0f;
    PrivilegedCustomer(){

    }
    void availLoan(float loan_amt){
        if((loan_amt+curr_loan_amt)<=credit_limit){
            System.out.println("Congrats!! You are elligible for the loan ");
            loan_amt=loan_amt+curr_loan_amt;
        }
        else{
            System.out.println("Sorry!! You are not elligible for the loan ");
        }
    }
}
class Bank{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int ch;
        Vector<Customer>cus = new Vector<Customer>();
        Vector<PrivilegedCustomer>pcus = new Vector<PrivilegedCustomer>();
        Customer c=new Customer();
        PrivilegedCustomer pc=new PrivilegedCustomer();
        while(true){
            System.out.print("Enter\n1: Create Customer\n2: Avail Loan\n3: Print Details\n4: Change Phone Number\n5: Exit\n");
            ch=Integer.parseInt(sc.nextLine());
            if(ch == 1){
            String choice;
            System.out.println("Enter Details \nA: Customer\nB: Privileged Customer ");
            System.out.print("Enter choice : ");
            choice=sc.nextLine();
            if(choice.equals("A")){
                c.getDetails();
                cus.add(c);
                System.out.println("DETAILS ADDED -:))");
            }
            else if(choice.equals("B")){
                pc.getDetails();
                pcus.add(pc);
                System.out.println("DETAILS ADDED -:))");
            }
            else{
                System.out.println("INVALID CHOICE ENTERED !!!! ");
              }
           } 
            else if(ch == 2){
            System.out.println("Check for Loan Availablity ");
            String n,id,choice;
            System.out.println("Enter your name & id ");
            n=sc.nextLine();
            id=sc.nextLine();
            System.out.println("Enter Details \nA: Customer\nB: Privileged Customer:");
            System.out.print("Enter choice : ");
            choice=sc.nextLine();
                if(choice.equals("A")){
                    int f=0;
                    for(int i=0;i<cus.size();i++){
                        if(cus.get(i).getId().equals(id) && cus.get(i).getName().equals(n)){
                            cus.get(i).availLoan();
                            f=1;
                        }
                    }
                    if(f==0){
                        System.out.println("You Are Not a Registered Customer of our Bank ");
                    }
                }
                else if(choice.equals("B")){
                    int f=0;
                    for(int i=0;i<pcus.size();i++){
                        if(pcus.get(i).getId().equals(id) && pcus.get(i).getName().equals(n)){
                            pcus.get(i).availLoan();
                            f=1;
                        }
                    }
                    if(f==0){
                        System.out.println("You Are Not a Registered Customer of our Bank ");
                    }
                }
            }
            else if(ch == 3){
                String n,id,choice;
                System.out.println("Enter your name & id ");
                n=sc.nextLine();
                id=sc.nextLine();
                System.out.print("Details of present loan in Account \nA: Customer\nB: Privileged Customer ");
                System.out.print("Enter choice : ");
                choice=sc.nextLine();
                    if(choice.equals("A")){
                        int f=0;
                        for(int i=0;i<cus.size();i++){
                            if(cus.get(i).getId().equals(id) && cus.get(i).getName().equals(n)){
                               cus.get(i).printDetails();
                               f=1;
                            }
                        }
                    if(f==0){
                        System.out.println("You Are Not a Registered Customer of our Bank ");
                    }
                }
                else if(choice.equals("B")){
                    int f=0;
                    for(int i=0;i<pcus.size();i++){
                        if(pcus.get(i).getId().equals(id) && pcus.get(i).getName().equals(n)){
                            pcus.get(i).printDetails();
                            f=1;
                        }
                    }
                    if(f==0){
                        System.out.println("You Are Not a Registered Customer of our Bank ");
                    }
                }
            }
            else if(ch == 4){
                System.out.print("Changing Details \nA: Customer\nB: Privileged Customer\n");
                System.out.print("Enter your previous id ");
                String id=sc.nextLine();
                System.out.print("Enter phone number you want to change : ");
                long p = Long.parseLong(sc.nextLine());
                System.out.print("Enter choice : ");
                String choice=sc.nextLine();
                if(choice.equals("A")){
                    int f=0;
                    for(int i=0;i<cus.size();i++){
                        if(cus.get(i).getId().equals(id)){
                           cus.get(i).setPhn(p);
                           f=1;
                        }
                    }
                if(f==0){
                    System.out.println("You Are Not a Registered Customer of our Bank ");
                }
                else{
                    System.out.println("Done Sucessfully!!! ");
                }
            }
            else if(choice.equals("B")){
                int f=0;
                for(int i=0;i<pcus.size();i++){
                    if(pcus.get(i).getId().equals(id)){
                        pcus.get(i).setPhn(p);;
                        f=1;
                    }
                }
                if(f==0){
                    System.out.println("You Are Not a Registered Customer of our Bank ");
                }
                else{
                    System.out.println("Done Sucessfully!!! "); 
                }
            }
            }
            else if(ch == 5){
                System.out.println("Thanks !!!");
                break;
            }
        }
    }
}