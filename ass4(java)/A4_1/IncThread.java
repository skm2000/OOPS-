package A4_1;

public class IncThread implements Runnable {
    private CointainsInt cI;
    public IncThread(CointainsInt ci){
        cI = ci;
    }
    @Override
    public void run(){
        int j = 1000000;
        while(j-->0){
            cI.incrValue();
        }
    }
}