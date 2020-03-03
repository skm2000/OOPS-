import java.io.*;
import java.util.Vector;
class Account{
    String acc_no,name;
    private float balance=0.0f;
    Scanner sc = new Scanner(System.in);
    Account(){
        System.out.println("Enter Account Number "); //Unique;
        acc_no = sc.next();
        this.acc_no = acc_no;
    }
    void putDetails(){
        System.out.println("Enter Name ");
        name = sc.next();
        System.out.println("Enter Balance ");
        balance = sc.nextFloat();
    }
    void getDetails(){
        System.out.println("Name ");
        System.out.println("Account Number ");
        System.out.println("Balnce ");
    }
    String getAcc_no(){
        return acc_no;
    }
    void checkUnique(){
        
    }
    void addItem(Account a){

    }

}
class Account_List{
    String ac;
    Vector<Account>va = new Vector<Account>();
    String takeAccNumber(){
        System.out.println("Enter Account number to check uniqueness ");
        ac = sc.next();
        return ac;
    }
    bool checkUnique(String ac){
        int found=0;
        Vector<Account>it = it.iterator();
        for(int i=0;i<va.size();i++){
            if(va.get(i).getAcc_no().equals(ac)){
                found=1;
            }
        }
        if(found == 1) System.out.println("Account Number already exists ");
        else System.out.println("Proceed Further ");
    }
    void addItem(){
        Account a = new Account();
        String x;
        x = takeAccNumber();
        if(checkUnique(x)){
            a.putDetails();
            va.add(a);
            System.out.println("New Account Added");
        }
    }
    void removeItem(){
        String x;
        int found=0;
        x = takeAccNumber();
        for(int i=0;i<va.size();i++){
            if(va.get(i).getAcc_no().equals(x)){
                va.get(i).remove(i);
                System.out.println("Removed");
                found=1;
                break;
            }
        }
        if(found == 0) System.out.println("Account Number not Found ");
    }
    void displayAll(){
        Vector<Account>it = it.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            System.out.println("******************");
        }
    }  
}
class Account_Main extends Account_List{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter Choice 1:Add Account\n2: Remove Account\n3:Display All\n4:Exit");
        while(true){
            if(ch == 1){
                addItem();
            }
            else if(ch == 2){
                removeItem();
            }
            else if(ch == 3){
                displayAll();
            }
            else if(ch == 4){
                break;
            }
        }
    }
}