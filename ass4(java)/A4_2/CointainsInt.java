package A4_2;
public class CointainsInt{
    int i;
    public CointainsInt(int I){
        i=I;
    }
    synchronized public void incrValue(){
        i++;
    }
    synchronized public void decrValue(){
        i--;
    }
    @Override
    public String toString(){
        return "CointainsInt : "+i+"\n";
    }
}