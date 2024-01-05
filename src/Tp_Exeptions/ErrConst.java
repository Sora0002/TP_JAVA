package Tp_Exeptions;

public class ErrConst extends Exception{
    private int n;
    public ErrConst(String message, int n){
        super(message);
        this.n = n;
    }
    public int getN(){
        return n;
    }
}
