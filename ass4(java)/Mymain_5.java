import java.util.*;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

class Employee
{
    String emp_code;
    String name;
    String basic_salary;
    String grade;
    String dept;
    public Employee(String s1,String s2,String s3,String s4,String s5)
    {
        emp_code=s1;
        name=s2;
        basic_salary=s3;
        grade=s4;
        dept=s5;
    }
    public Employee(String s1)
    {
        emp_code=s1;
    }
    public boolean equals(Object t)
    {
        if(t instanceof Employee)
        {
            Employee s1=(Employee)t;
            return emp_code.equals(s1.emp_code);


        }
        else{
            return false;
        }
    }
    public String toString()
    {
        return "Emp_code:"+emp_code+"\n"+"name:"+name+"\n"+"basic_salary:"+basic_salary+"\n"+"grade:"+grade+"\n"+"dept:"+dept;
    }
}

class MyWindow extends JFrame
{
    JPanel p;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4;
    JRadioButton rb1,rb2,rb3;
    ButtonGroup bg1;
    JButton b,b1;
    JList dept;
    JButton save;
    ArrayList<Employee> arr;
    public MyWindow()
    {
        super();
        arr=new ArrayList<Employee>();
        setSize(1000,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildPanel();
        add(p);
        setVisible(true);

    }
    class Mylistener1 implements ActionListener
    {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e)
        {
            String s;
            s=t4.getText();
            boolean flag=true;
            Iterator it=arr.iterator();
            while(it.hasNext())
            {
                Employee e1=(Employee)it.next();
                if(e1.emp_code.equals(s))
                {
                    String s2=e1.toString();
                    JOptionPane.showMessageDialog(null,s2);
                    flag=false;
                }
            }
            if(flag)
            {
                JOptionPane.showMessageDialog(null,"Invalid Employee code");   
            }

        }
    }
    class MyListener implements ActionListener
    {

  

		@Override
		public void actionPerformed(java.awt.event.ActionEvent e) {
            String s1,s2,s3,s4,s5;
            s1=t1.getText();
            s2=t2.getText();
            s3=t3.getText();
            s4="";
            if(rb1.isSelected())
            {
                s4="Grade A";
            }
            if(rb2.isSelected())
            {
                s4="Grade B";
            }
            if(rb3.isSelected())
            {
                s4="Grade C";
            }
            s5=(String)dept.getSelectedValue();
            if(arr.contains(new Employee(s1)))
            {
                JOptionPane.showMessageDialog(null,"Employee code taken");
            }
            else{
                Employee e1=new Employee(s1,s2,s3,s4,s5);
                arr.add(e1);
                JOptionPane.showMessageDialog(null,e1.toString());
            }
			
		}
    }
    public void buildPanel()
    {
        p=new JPanel();
        //p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        l1=new JLabel("Emp_Code");
        l2=new JLabel("Emp_name");
        l3=new JLabel("Basic_Salary");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        rb1=new JRadioButton("Grade A");
        rb2=new JRadioButton("Grade B");
        rb3=new JRadioButton("Grade C");
        bg1=new ButtonGroup();
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(t3);
        bg1.add(rb1);
        bg1.add(rb2);
        bg1.add(rb3);
        p.add(rb1);
        p.add(rb2);
        p.add(rb3);
        b1=new JButton("SEARCH");
        String arr[]={"CSE","IT","ETCE","Chemical"};
        dept=new JList(arr);
        dept.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        l4=new JLabel("Department");
        p.add(l4);
        p.add(dept);
        save=new JButton("Save");
        save.addActionListener(new MyListener());
        p.add(save);
        b1.addActionListener(new Mylistener1());
        p.add(b1);
        t4=new JTextField("Enter emp_code");
        p.add(t4);



}

}

class Mymain_5
{
    public static void main(String[] args) {
        MyWindow w=new MyWindow();
    }
}