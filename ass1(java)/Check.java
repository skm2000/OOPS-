import java.util.Scanner;
class Check{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String a,b;
        System.out.println("Enter first string ");
        a=sc.nextLine();
        System.out.println("Enter 2nd String ");
        b=sc.nextLine();
        if(b == a){//REFERENCE CHECK
            System.out.println("Equal ");
        }
        else{
            System.out.println("Not Equal ");
        }
        if(a.equals(b)){//EXACT CHECK
            System.out.println("Equal ");
        }
        else{
            System.outn.println("Not Equal ");
        }
    }
}