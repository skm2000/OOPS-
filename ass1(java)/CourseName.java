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
    private String course_name;
    private Instructor i;
    private TextBook book;
    CourseName(String name){
        course_name=name;
    }
    public String getCourse_name() {
        return course_name;
    }
    public TextBook getBook() {
        return book;
    }
    public void setBook(TextBook book) {
        this.book = book;
    }
    public Instructor getI() {
        return i;
    }
    public void setI(Instructor i) {
        this.i = i;
    }

    public void setCourse_name(final String course_name) {
        this.course_name = course_name;
    }
    public void print(){
        System.out.println("Course_name: "+course_name);
        book.print();
        i.print();
    }
    public static void main(String args[]){
        TextBook tb = new TextBook();
        tb.setAuthor("Willams");
        tb.setTitle("Computer Application ");
        tb.setPublish("Publications");
        CourseName c=new CourseName("Science");
        c.setBook(tb);
        Instructor i=new Instructor();
        i.setName("Shubham");
        i.setPhn("9635438171");
        c.i=i;
        c.print();
    }
}