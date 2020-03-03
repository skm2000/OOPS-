package A4_2;

public class DecrThread implements Runnable {
    private CointainsInt cI;
    public DecrThread(CointainsInt ci) {
        cI = ci;
    }
    @Override
    public void run(){
        int j = 1000000;
        while(j-->0){
            cI.decrValue();
        }
    }
}