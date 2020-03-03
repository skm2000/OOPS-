import java.util.Scanner;
class Wrapper{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        Integer ival = new Integer(i);//PRIMITIVE INTEGER TO INTEGER OBJECT
        Wrapper w=new Wrapper();
        int p=w.intValue();//OBJECT TO PRIMITIVE INTEGER
        String str = Integer.toString(i);//PRIMITIVE INTEGER TO STRING
        String s;
        int IntVal = Integer.valueOf(s);//CONVERT STRING TO INTEGER OBJECT
        int im=Integer.parseInt(s);//CONVERT STRING TO PRIMITIVE INTEGER
    }
}