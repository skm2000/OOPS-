import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
class Department{
    Scanner sc = new Scanner(System.in);
    protected String dept_name,loc,dept_code;
    void details(){
        System.out.println("Enter Department code ");
        dept_code = sc.nextLine();
        System.out.println("Enter Department name ");
        dept_name=sc.nextLine();
        System.out.println("Enter location");
        loc=sc.nextLine();
    }
    void show(){
        System.out.println("Department name : "+dept_name);
        System.out.println("Department Code(unique) : "+dept_code);
        System.out.println("Location : "+loc);
    }
    public String getDept_code(){
        return dept_code;
    }
}
//MAPPING BETWEEN DEPARTMENT CODE WITH DEPARTMENT OBJECT//
class Department_Map extends Department{
    HashMap<String,Department>dmap = new HashMap<String,Department>();
    void addDetails(Department d){
        d.details();
        dmap.put(dept_code,d);
        System.out.println("Details Sucessfully Added ");
    }
}
class Employee{
    Scanner sc = new Scanner(System.in);
    String emp_code,emp_name,dept_code;
    float basic=0.0f;
    void details(){
        System.out.println("Enter Employee code(unique) : ");
        emp_code=sc.nextLine();
        System.out.println("Enter Employee name : ");
        emp_name=sc.nextLine();
        System.out.println("Enter Basic Pay : ");
        basic=Float.parseFloat(sc.nextLine());
    }
    void show(){
        System.out.println("Employee Code : "+emp_code);
        System.out.println("Employee Name : "+emp_name);
        System.out.println("Basic Pay : "+basic);
    }
    public void setBasic(float basic){
        this.basic=basic;
    }  
}
//MAPING BETWEEN EMPLOYEE CODE AND EMPLOYEE OBJECT//
class Employee_Map extends Employee{
    Scanner sc=new Scanner(System.in);
    String code;
    int found=0;
    HashMap<String,Employee> emap = new HashMap<String,Employee>();
    void addDetails(Employee e){
        System.out.println("Enter dept code to check ");
        code = sc.nextLine();
        for(String s: dmap.keySet()){
            if(s.equals(code)){
                System.out.println("~~~~~CORRECT DEPARTMENT CODE~~~~~~~~~~~");
                found=1;
                break;
            }
        }
        if(found==1){
            e.details();
            emap.put(emp_code,e);
            System.out.println("Details Added ");
        }
        else{
            System.out.println("MATCH NOT FOUND ");
        }
    }
    void modifyBasic(){
        String x;
        int f=0;
        Employee em;
        System.out.println("Enter employee code whose basic pay you want to change ");
        x=sc.nextLine();
        for(final String s: emap.keySet()){
            if(s.equals(x)){
                System.out.println("~~~~~CORRECT DEPARTMENT CODE~~~~~~~~~~~");
                em=emap.get(s);
                f=1;
                break;
            }
        }
        if(f==1){
            System.out.println("Enter employee new basic pay");
            final float pay=Float.parseFloat(sc.nextLine());
            em.setBasic(pay);
            System.out.println("Done ");
        }    
    }
    void remove(final String e){
        Iterator<Map.Entry<String,Employee>>ie = emap.entrySet().iterator();
        int f=0;
        while(ie.hasNext()){
            Map.Entry<String,Employee>entry=ie.next();
            if(ie.cointainsKey(e)){
                ie.remove();
                System.out.println("Removed Sucessfully ");
                f=1;
                break;
            }
        }
        if(f==0) System.out.println("Employee Code not Found ");
    }
}
/*Iterator<Employee> it = elist.iterator();*/
