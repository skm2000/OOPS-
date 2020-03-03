class Instructor {
    private String name, phone_number;

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setName(final String name) {
        this.name = name;
    }
    public void print(){
        System.out.println("Name: "+name+" phone_number: "+phone_number);
    }
}

class Textbook {
    private String author, title, publisher;

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(final String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }
    public void print(){
        System.out.println("title: "+title+" author: "+author+" Publisher: "+publisher);
    }
}

class Course {
    private String course_name;
    private Textbook book;
    private Instructor i;
    Course(String name){
        course_name=name;
    }
    public String getCourse_name() {
        return course_name;
    }

    public Textbook getBook() {
        return book;
    }

    public void setBook(Textbook book) {
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
    public static void main(String[] args) {
        Textbook t=new Textbook();
        t.setAuthor("Williams");
        t.setPublisher("Publications");
        t.setTitle("Shubham");
        Course c=new Course("Computer Science");
        c.setBook(t);
        Instructor i=new Instructor();
        i.setName("Shubham");
        i.setPhone_number("987654321");
        c.i=i;
        c.print();
    }

}