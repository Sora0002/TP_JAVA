package Tp_Exeptions;
public class EntNat {
    int n;
    public EntNat(int n) throws ErrConst{
        if (n < 0){
            throw new ErrConst();
        }
        this.n = n;
    }
    public int getN(){
        return n;
    }
}

