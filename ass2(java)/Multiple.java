import java.util.Scanner;
class Multiple{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       String s;
       int count=0;
       System.out.println("Enter String : ");
       s=sc.nextLine();
       char ch[] = new char[s.length()];
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='a'){
               count++;
           }
       }
       System.out.println("No of a's are "+count);
       count=0;
       String st[]=s.split(" ");
       String word="and";
       for(int i=0;i<st.length;i++){
           if(word.equals(st[i])){
                count++;
           }
       }
       System.out.println("No of 'and' in String are :"+count);
       System.out.println(s.startsWith("The"));
       // Call the replaceAll() method 
       s = s.replaceAll("\\s", ""); 
       for(int i=0;i<s.length();i++){
           ch[i]=s.charAt(i);
       }
       for (char c : ch) { 
        System.out.print(c); 
    } 
   }
}