import java.util.*;

class Department
{
	int dcode;
	String name;
	String location;
	
	Department()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter department code: ");
		dcode= s.nextInt();
		System.out.println("Enter department name: ");
		name= s.next();
		System.out.println("Enter department location: ");
		location= s.next();
	}
	
	public boolean equals(Department d)
	{
		return (dcode==d.dcode);
	}
	
	void display()
	{
		System.out.println("Department name: "+name);
		System.out.println("Department location: "+location);
	}
}

class Employee
{
	int ecode;
	String name;
	int basic;
	int dcode;
	
	Employee()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter employee code: ");
		ecode= s.nextInt();
		System.out.println("Enter employee name: ");
		name= s.next();
		System.out.println("Enter employee basic: ");
		basic= s.nextInt();
		System.out.println("Enter department code: ");
		dcode= s.nextInt();
	}
	
	Employee(int i)
	{
		ecode=i;
	}
	
	public boolean equals(Employee e)
	{
		return (ecode==e.ecode);
	}
	
	void display()
	{
		System.out.println("Employee code: "+ecode);
		System.out.println("Employee name: "+name);
		System.out.println("Employee basic: "+basic);
		System.out.println("Department code: "+dcode);
	}
	
	//@Override
	public static Comparator<Employee> EmpBasic = new Comparator<Employee>()
			{
		public int compare(Employee e1, Employee e2)
		{
			return e2.basic-e1.basic;
		}
			};
	
	//@Override
	public static Comparator<Employee> EmpEcode = new Comparator<Employee>()
			{
		public int compare(Employee e1, Employee e2)
		{
			return e1.ecode-e2.ecode;
		}
			};
			
	//@Override		
	public static Comparator<Employee> EmpDcode = new Comparator<Employee>()
			{
		public int compare(Employee e1, Employee e2)
		{
			return e1.dcode-e2.dcode;
		}
			};
}

public class MyMain_3_1
{
	public static void main(String args[])
	{
		ArrayList<Department> dept= new ArrayList<Department>();
		ArrayList<Employee> emp= new ArrayList<Employee>(5);
		int i;
		Scanner s= new Scanner(System.in); 
		int flag=1,j=0,total;
		while(flag>0)
		{
			System.out.println("Enter your choice: ");
			System.out.println("1. Add employee");
			System.out.println("2. Add department");
			System.out.println("3. View employee details");
			System.out.println("4. View all employees");
			System.out.println("5. View total basic pay for a department");
			System.out.println("6. Remove employee");
			System.out.println("7. Modify basic of employee");
			System.out.println("8. Sort employees according to basic in descending order");
			System.out.println("9. Sort employees according to ecode in ascending order");
			System.out.println("10. Sort employees according to dcode in ascending order");
			System.out.println("0. Exit");
			flag= s.nextInt();
			switch(flag)
			{
			case 0: break;
			
			case 1: emp.add(new Employee());
			        break;
			        
			case 2: dept.add(new Department());
			        break;
			        
			case 3: System.out.println("Enter employee id: ");
			        i= s.nextInt();
			        for(Employee e1: emp)
					{
						if(e1.ecode==i)
							{
							j=1;
							e1.display();
							for(Department d: dept)
							{
								if(d.dcode==e1.dcode)
									{
									d.display();
									break;
									}
							}
							break;
							}
					}
					if(j==0)
						System.out.println("The employee ID does not exist!!");
			        break;
			        
			case 4: System.out.println("Employee Details:-");
			        for(Employee e1: emp)
			        {
 				         e1.display();
			        }
			        break;
			        
			case 5: System.out.println("Enter department code: ");
	                i= s.nextInt();
	                total=0;
	                for(Employee e1: emp)
			        {
				         if(e1.dcode==i)
					       {
					       j=1;
					       total= total+ e1.basic;
					       }
					}
			        if(j==0)
				        System.out.println("The department ID does not exist!!");
			        else
			        	System.out.println("The total basic pay of the department is "+total);
	                break;
	                
			case 6: System.out.println("Enter employee ID: ");
			        i= s.nextInt();
			        for(Employee e1: emp)
	                {
	                	if(e1.ecode==i)
	                	{
	                		emp.remove(e1);
						    break;
					    }
	                }
			        break;
			        
			case 7: System.out.println("Enter employee ID: ");
	                i= s.nextInt();
	                for(Employee e1: emp)
	                {
	                	if(e1.ecode==i)
	                	{
	                		System.out.println("Enter employee basic: ");
						    e1.basic= s.nextInt();
						    break;
					    }
	                }
	                break;
	                
			case 8: Collections.sort(emp, Employee.EmpBasic);
			        break;
			        
			case 9: Collections.sort(emp, Employee.EmpEcode);
	                break;
		    
			case 10: Collections.sort(emp, Employee.EmpDcode);
                    break;
                    
            default: System.out.println("Invalid choice!!");
			}
		}
 	}
}