import java.util.Scanner;
class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        short a,b;
        int sum=0;
        System.out.println("Enter first number ");
        a = sc.nextShort();
        System.out.println("Enter second number ");
        b = sc.nextShort();
        sum = a+b;
        System.out.println("Sum is "+sum);
    }
}