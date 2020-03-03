import java.util.Scanner;
import java.util.Vector;
interface Address {
	public void getDetails();
	public void getAddress();
}
class Person implements Address{
	Scanner sc=new Scanner(System.in);
	private String street,p_num,state;
	String name,e_mail;
	private long phn_number,pin_code;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getP_num() {
		return p_num;
	}
	public void setP_num(String p_num) {
		this.p_num = p_num;
	}
	public long getPin_code() {
		return pin_code;
	}
	public void setPin_code(long pin_code) {
		this.pin_code = pin_code;
	}
	public void getDetails() {
        System.out.println("Student Details ");
		System.out.println("Enter your name : ");
		name=sc.nextLine();
		System.out.println("Enter your phn_number : ");
		phn_number=Long.parseLong(sc.nextLine());
		System.out.println("Enter your mail : ");
		e_mail=sc.nextLine();
	}
	public void getAddress() {
		System.out.println("Enter premises number : ");
		p_num=sc.nextLine();
		System.out.println("Enter street name : ");
		street=sc.nextLine();
		System.out.println("Enter city pin : ");
		pin_code=Long.parseLong(sc.nextLine());
		System.out.println("Enter state : ");
		state=sc.nextLine();
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Phone Number: "+phn_number);
        System.out.println("Email-id: "+e_mail);
        System.out.println("Premisis Number: "+p_num);
        System.out.println("Street Name: "+street);
        System.out.println("City-pin: "+pin_code);
        System.out.println("State "+state);
    }
}
class Student extends Person{
    Student(){

    }
	String s_roll,course;
	public void getDetails() {
        super.getDetails();
        super.getAddress();
		System.out.println("Enter your roll number : ");
		s_roll=sc.nextLine();
		System.out.println("Enter your course : ");
		course=sc.nextLine();
	}
	public void displayDetails() {
        super.displayDetails();
		System.out.println("Roll number : "+s_roll);
		System.out.println("Course Name : "+course);
	}
	public String getS_roll() {
		return s_roll;
	}
	public void setS_roll(String s_roll) {
		this.s_roll = s_roll;
	}
}
class Faculty extends Person{
    String e_id,dept,spe;
    @Override
    public void getDetails(){
        super.getDetails();
        super.getAddress();
        System.out.println("Enter employee id ");
	    e_id=sc.nextLine();
	    System.out.println("Enter employee department ");
        e_id=sc.nextLine();
        System.out.println("Enter Specialization ");
        spe=sc.nextLine();
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
		System.out.println("Employee id : "+e_id);
        System.out.println("Employee Name : "+dept);
        System.out.println("Specialization : "+spe);
    }
    public String getE_id() {
		return e_id;
	}
}
class Person_main{
    public static void main(String[]args){
        String ch;
        Scanner sc=new Scanner(System.in);
        Vector<Student>std=new Vector<Student>();
        Vector<Faculty>fac=new Vector<Faculty>();
        Student s = new Student();
        Faculty f = new Faculty();
        while(true){
            System.out.println("Enter\nS:Student\nF:Faculty");
            ch=sc.nextLine();
            if(ch.equals("S")){
                while(true){
                    System.out.println("Enter\n1:Details Entry\n2:Changing Address\n3:Displaying Details\n4:Exit");
                    int c=Integer.parseInt(sc.nextLine());
                    if(c==1){
                        s.getDetails();
                        std.add(s);
                        System.out.println("Details Added !!");
                    }
                    else if(c==2){
                        int x=0,ind=0;
                        System.out.println("Enter roll number whose address you want to change : ");
                        String r=sc.nextLine();
                        for(int i=0;i<std.size();i++){
                            if(std.get(i).getS_roll().equals(r)){
                                x=1;
                                ind=i;
                                System.out.println("Match Found ");
                            }
                        }
                        if(x==0){
                            System.out.println("Match not Found!!!");
                            break;
                        }
                        else{
                            while(true){
                                System.out.println("Enter which part of the address you want to change\n1:Premisis Number\n2:Street Name\n3:City Pin\n4:Exit");
                                int k=Integer.parseInt(sc.nextLine());
                                if(k==1){
                                    System.out.println("Enter premisis number");
                                    String p=sc.nextLine();
                                    std.get(ind).setP_num(p);
                                    System.out.println("Changed~~~");
                                }
                                else if(k==2){
                                    System.out.println("Enter street name ");
                                    String p=sc.nextLine();
                                    std.get(ind).setStreet(p);
                                    System.out.println("Changed~~~");
                                }
                                else if(k==3){
                                    System.out.println("Enter city pin ");
                                    long p=Long.parseLong(sc.nextLine());
                                    std.get(ind).setPin_code(p);
                                    System.out.println("Changed~~~");
                                }
                                else{
                                    System.out.println("Thanks!!!");
                                    break;
                                }
                            }
                        }
                    }
                    else if(c==3){
                        int x=0;
                        System.out.println("Enter roll number whose details you want to see : ");
                        String r=sc.nextLine();
                        for(int i=0;i<std.size();i++){
                            if(std.get(i).getS_roll().equals(r)){
                                std.get(i).displayDetails();
                                x=1;
                                break;
                            }
                        }
                        if(x==0){
                            System.out.println("Match not Found!!!");
                        }
                    }
                    else if(c==4){
                        System.out.println("Student part done !!!");
                        break;
                    }
                }
            }
            else if(ch.equals("F")){
                System.out.println("Enter\n1:Details Entry\n2:Changing Address\n3:Displaying Details\n4:Exit");
                int c=Integer.parseInt(sc.nextLine());
                while(true){
                    if(c==1){
                        f.getDetails();
                        System.out.println("Details Added !!");
                        fac.add(f);
                    }
                    else if(c==2){
                        //Almost same as student
                    }
                    else if(c==3){
                        int x=0;
                        System.out.println("Enter employee id whose details you want to see : ");
                        String r=sc.nextLine();
                        for(int i=0;i<std.size();i++){
                            if(fac.get(i).getE_id().equals(r)){
                                fac.get(i).displayDetails();
                                x=1;
                            }
                        }
                        if(x==0){
                            System.out.println("Match not Found!!!");
                        }
                    }
                    else if(c==4){
                        System.out.println("Faculty part done !!!");
                        break;
                    }
                }
            }
            else{
                System.out.println("You Have entered an invalid choice !!");
            }
        }
    }
}