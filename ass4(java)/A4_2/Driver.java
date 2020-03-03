package A4_2;
public class Driver{
    public static void main(String[] args) {
        
        CointainsInt cI = new CointainsInt(10);

        Thread t1 = new Thread(new IncThread(cI));
        Thread t2 = new Thread(new DecrThread(cI));
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException iE){
            System.out.println(iE);
        }
        System.out.println(cI);
    }
}