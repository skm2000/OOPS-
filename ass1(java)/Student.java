import java.util.Scanner;
class Student{
    private String name,roll;
    private float score;
    public void getData(String n,String r,float s){
        name = n;
        roll = r;
        score = s;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setRoll(String r){
        this.roll=r;
    }
    public void setScore(float s){
        this.score=s;
    }
    public void displayData(){
        System.out.print("Name : "+name+"\nRoll : "+roll+"\nScore : "+score+"\n");
    }
    public void copyData(Student t){
        t.name=name;
        t.roll=roll;
        t.score=score;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.print("Enter name : ");
        s1.name=sc.nextLine();
        System.out.print("Enter roll : ");
        s1.roll=sc.nextLine();
        System.out.print("Enter score :");
        s1.score=sc.nextFloat();
        s1.getData(s1.name,s1.roll,s1.score);
        s1.displayData();
        Student s2 = new Student();
        s1.copyData(s2);
        s2.displayData();
        s2.setName("Raha");
        s2.displayData();
    }
}