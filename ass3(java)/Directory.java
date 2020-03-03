import java.io.*;
import java.util.Scanner;
class Directory{
    public static void main(String[] args) {
        String filename;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter filename ");
        filename = sc.next();
        File obj = new File(filename);
        if(obj.exists()){
            System.out.println("File Found");
        }
        else{
            System.out.println("File Not Found");
            System.exit(-1);
        }
        if(obj.isDirectory()){
            System.out.println("It is a Directory");
            for(File f1:obj.listFiles()){
                System.out.println(f1.getName());
            }
        }
        else{
            System.out.println("Not a directory");
            if(new File(filename).canRead()){
                System.out.println("Can Read");
            }
            else{
                System.out.println("Cannot Read");
            }
            if(new File(filename).canWrite()){
                System.out.println("Can Write");
            }
            else{
                System.out.println("Cannot Write");
            }
        }
    }
}