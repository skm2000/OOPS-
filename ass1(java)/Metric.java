import java.util.Scanner;
class Metric{
    final static float k=1.5f;
    static float km_to_mile(float dis_km){
        return dis_km*k;
    }
    static float mile_to_km(float dis_m){
        return dis_m/k;
    }
    public static void main(String []args){
        float dis_km=0.0f,dis_m=0.0f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter distance in km ");
        dis_km=sc.nextFloat();
        System.out.print("Answer "+km_to_mile(dis_km)+"\n");
        System.out.print("Enter distance in mile ");
        dis_m=sc.nextFloat();
        System.out.print("Answer "+mile_to_km(dis_m)+"\n");
    }
}