import java.io.*;
import java.io.PrintWriter;
import java.util.*;
class WriteFile{
    public static void main(String args[]) throws IOException {
        PrintWriter out = new PrintWriter("/home/shubham/Java/names.txt");
        out.println("Alpha");
        out.println("Beta");
        out.println("Gamma");
        out.println("Lambda");

        out.close();
    }
}
class ReadFile{
    public static void main(String[] args) throws IOException{
        File fr = new File("/home/shubham/Java/names.txt");
        Scanner inFile = new Scanner(fr);
        while(inFile.hasNext()){
            String line = inFile.nextLine();
            System.out.println(line);
        }
        inFile.close();
    }
}