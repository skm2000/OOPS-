import java.util.Scanner;
class Instructor{
    private String name,phn_number;
    public String getName(){
        return name;
    }
    public void setName(final String name){
        this.name = name;
    }
    public String getPhn(){
        return phn_number;
    }
    public void setPhn(final String phn_number){
        this.phn_number=phn_number;
    }
    public void displayDetails(){
        System.out.print("Name : "+name+"\n"+"Phone Number : "+phn_number);
    }
}
class TextBook{
    private String title,author_name,pub;
    public String getTitle(){
        return title;
    }
    public void setTitle(final String title){
        this.title=title;
    }
    public String getAuthor(){
        return author_name;
    }
    public void setAuthor(final String author_name){
        this.author_name=author_name;
    }
    public String getPublish(){
        return pub;
    }
    public void setPublish(final String pub){
        this.pub=pub;
    }
    public void displayDetails(){
        System.out.print("Title : "+title+"\n"+"Author Name : "+author_name+"\n"+"Publisher "+pub);
    }
}
class CourseName{
    
}