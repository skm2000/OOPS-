import java.util.Scanner;
import java.lang.Exception;
class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}
class Excep{
    private String roll,name;
    private float score =0.0f;
    public void setScore(float score){
        this.score = score;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRoll(String roll){
        this.roll = roll;
    }
    public String getName(){
        return name;
    }
    public String getRoll(){
        return roll;
    }
    public static void main(String []args){
        Excep e = new Excep();
        Scanner sc = new Scanner(System.in);
        try{
            e.setName("Rahul");
            e.setRoll("12345678");
            System.out.println("Name : "+e.getName());
            System.out.println("Roll : "+e.getRoll());
            System.out.println("Enter the score ");
            e.score = Float.parseFloat(sc.nextLine());
            if(e.score<0 || e.score>100){
                throw new MyException("####@@@@Not in Range Exception.Please Enter a value betwwn 0 & 100####@@@@");
            }
            e.setScore(e.score);
            System.out.println("Score "+e.score);
        }
        catch(MyException ep){
            System.out.println("Caught the exception ");
            System.out.println(ep.getMessage());
        }
        finally{
            System.out.println("Final Executed !!!");
        }
    }
}
