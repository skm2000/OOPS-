import java.util.Scanner;
class Area{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    final float pi=3.14f;
    float rad,area=0.0f;
    System.out.print("Enter Radius of a circle : ");
    rad = sc.nextFloat();
    area = pi*(rad*rad);
    System.out.println("Area is :"+area);
    }
}