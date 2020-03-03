import java.util.Scanner;
class Height{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int height;
        final float x=30.5f;
        final float y=2.54f;
        float feet,inch;
        System.out.println("Enter height in cm ");
        height = sc.nextInt();
        feet = (int)(height/x);
        inch = (int)((height%x)/y);
        System.out.println("Height in Feet and Inches : "+feet+" "+inch);
        }
}