import java.io.*;
import java.util.*;

class Data
{
    int x;
    Data(int i)
    {
        x=i;
    }
    public int read()
    {
        return(x);
    }
    public void write(int k)
    {
        x=k;
    }
}

class Permission
{
    int cntr,cntw,cntwq;
    synchronized void seekReadPermission()
    {
        if(cntw>0||cntwq>0)
        {
            try{
                wait();
            }
            catch(Exception e)
            {}
            cntr++;
        }
    }
    synchronized public void readOverNotification()
    {
        cntr--;
        notifyAll();
    }
    synchronized public void seekWritePermission()
    {
        cntwq++;
        if(cntr>0||cntw>0)
        {
            try{
                wait();
            }
            catch(Exception e){
            }
            cntwq--;
        }
    }
    synchronized public void writeOverNotification()
    {
        cntw--;
        notifyAll();
    }

}

class Reader implements Runnable
{
    Data d;
    Permission p;
    Reader(Data d1,Permission p1)
    {
        d=d1;
        p=p1;
    }
    public void run()
    {
        int a;
        p.seekReadPermission();
        a=d.read();
        p.readOverNotification();
        System.out.println(a);
    }
}

class Writer implements Runnable
{
    Data d;
    Permission p;
    public Writer(Data d1,Permission p1)
    {
        d=d1;
        p=p1;
    }
    public void run()
    {
        p.seekWritePermission();
        d.write(10);
        p.writeOverNotification();
    }
}

class Mymain_3
{
    public static void main(String[] args) {
        
    Data d=new Data(5);
    Permission p=new Permission();
    Reader r=new Reader(d,p);
    Writer w=new Writer(d,p);
    Thread t1=new Thread(r);
    Thread t2=new Thread(w);
    t1.start();
    t2.start();}
}