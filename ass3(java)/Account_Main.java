import java.util.*; 
class Account{
    String acc_no,name;
    private float balance=0.0f;
    Scanner sc = new Scanner(System.in);
    void putDetails(){
        System.out.println("Enter Account Number "); //Unique;
        acc_no = sc.next();
        System.out.println("Enter Name ");
        name = sc.next();
        System.out.println("Enter Balance ");
        balance = sc.nextFloat();
    }
    public String toString(){
        return "Name :"+name+"\n"+"Acc num :"+acc_no+"\n"+"Balance :"+balance+"\n";
    }
    String getAcc_no(){
        return acc_no;
    }
}
class Account_List{
    Scanner sc = new Scanner(System.in);
    Vector<Account>va = new Vector<Account>();
    String takeAccNumber(){
        System.out.println("Enter Account number to check uniqueness ");
        String ac = sc.next();
        return ac;
    }
    boolean checkUnique(String x){
        int found=0;
        for(int i=0;i<va.size();i++){
            if(va.get(i).getAcc_no().equals(x)){
                found=1;
            }
        }
        if(found == 0) return true;
        return false;
    }
    void addItem(){
        Account a = new Account();
        String x;
        x = takeAccNumber();
        if(checkUnique(x)){
            System.out.println("Proceed Further ");
            a.putDetails();
            va.add(a);
            System.out.println("New Account Added");
        }
        else{
            System.out.println("Account Number already exists ");
        }
    }
    void removeItem(){
        String x;
        int found=0;
        x = takeAccNumber();
        for(int i=0;i<va.size();i++){
            if(va.get(i).getAcc_no().equals(x)){
                va.remove(i);
                System.out.println("Removed");
                found=1;
                break;
            }
        }
        if(found == 0) System.out.println("Account Number not Found ");
    }
    void displayAll(){
        Iterator it = va.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            System.out.println("******************");
        }
    }
      
}
class Account_Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        Account_List al = new Account_List();
        while(true){
            System.out.println("Enter Choice \n1:Add Account\n2:Remove Account\n3:Display All\n4:Exit");
            ch = sc.nextInt();
            if(ch == 1){
                al.addItem();
            }
            else if(ch == 2){
                al.removeItem();
            }
            else if(ch == 3){
                al.displayAll();
            }
            else if(ch == 4){
                break;
            }
        }
    }
}