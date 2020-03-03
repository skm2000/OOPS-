import java.io.*;
import java.util.*;
class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private String roll;
    private float score = 0.0f;
    Student(){

    }
    Student(String name,String roll,float score){
        this.name = name;
        this.roll = roll;
        this.score = score;
    }
    @Override
    public String toString() {
        return "Name :"+name+"\n"+"Roll :"+roll+"\n"+"Score :"+score+"\n";
    }
}
class WriteObject{
    public static void main(String[] args) throws IOException{
        Student s1 = new Student("Alpha","100",90.5f);
        Student s2 = new Student("Beta","101",92.5f);
        Student s3 = new Student("Gamma","100",94.00f);
        FileOutputStream fo = new FileOutputStream(new File("Objects.txt"));//Create a New File using FileOutputStream
        ObjectOutputStream oo = new ObjectOutputStream(fo);//The objects can be converted into byte-stream using java.io.ObjectOutputStream. 
        //In order to enable writing of objects into a file using ObjectOutputStream, 
        //it is mandatory that the concerned class implements Serializable interface.
        oo.writeObject(s1);
        oo.writeObject(s2);
        oo.writeObject(s3);
        oo.close();
        fo.close();
    }
}

class ReadObject{
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        FileInputStream fi = new FileInputStream(new File("Objects.txt"));
        ObjectInputStream oi = new ObjectInputStream(fi);
        /*
        Student s1 = (Student) oi.readObject();
        Student s2 = (Student) oi.readObject();
        Student s3 = (Student) oi.readObject();
        */
        boolean eof = false;   
        while(!eof){
            try {
                Student temp = (Student) oi.readObject();
                System.out.println(temp);
            } catch(IOException ioE){
                eof = true;
            }
        }
        oi.close();
        fi.close();
        /*
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        */
    }
}