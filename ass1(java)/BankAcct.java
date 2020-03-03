import java.util.Scanner;
class BankAcct{
    private String acn;
    private float bal;
    static float ir=0;
    static float rateCalculate(float ir,float bal){
        return (ir*bal)/100;
    }
    public void displayData(){
        System.out.print("Account number "+acn+"\nBalance "+bal+"\nInterest Rate "+ir+"\n");
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        BankAcct b = new BankAcct();
        System.out.print("Enter Account Number : ");
        b.acn=sc.nextLine();
        System.out.print("Enter Balance : ");
        b.bal=sc.nextFloat();
        System.out.print("Enter Rate : ");
        ir=sc.nextFloat();
        float ans=BankAcct.rateCalculate(ir,b.bal);
        b.displayData();
        System.out.println("Interest : "+ans);
    }
}