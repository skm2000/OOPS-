import java.util.Scanner;
class Student_Next{
    private String name,roll;
    private float score;
    Student_Next(){
        System.out.println("Empty Constructor ");
        name = null;
        roll = null;
        score = 0.0f;
    }
    Student_Next(String roll){
        System.out.println("Using roll only ");
        this.roll = roll;
    }
    Student_Next(String name,String roll){
        System.out.println("Using roll and name ");
        this.name=name;
        this.roll=roll;
    }
    Student_Next(String name,String roll,float score){
        System.out.println("Using roll name and score ");
        this.name=name;
        this.roll=roll;
        this.score=score;
    }
    Student_Next(Student_Next t){
        t.name=name;
        t.roll=roll;
        t.score=score;
    }
    public void displayData(){
        System.out.print("Name : "+name+"\nRoll : "+roll+"\nScore : "+score+"\n");
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Student_Next s1=new Student_Next();
        System.out.print("Enter name : ");
        s1.name=sc.nextLine();
        System.out.print("Enter roll : ");
        s1.roll=sc.nextLine();
        System.out.print("Enter Score : ");
        s1.score=sc.nextFloat();
        Student_Next s2=new Student_Next(s1.roll+1);
        Student_Next s3=new Student_Next("Rahul",s1.roll+1);
        Student_Next s4=new Student_Next("Rahu",s1.roll+2,s1.score+10);   
        Student_Next s5=new Student_Next(s1);//DEEP COPY
        Student_Next s6=s1;//SHALLOW COPY
        if(s5==s1){
            System.out.println("Deep Copy");
        }
        if(s6==s1){
            System.out.println("Shallow Copy");
        }
    }
}