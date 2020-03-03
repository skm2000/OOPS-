package A4_1;
public class CointainsInt{
    int i;
    public CointainsInt(int I){
        i=I;
    }
    public void incrValue(){
        i++;
    }
    public void decrValue(){
        i--;
    }
    @Override
    public String toString(){
        return "CointainsInt : "+i+"\n";
    }
}