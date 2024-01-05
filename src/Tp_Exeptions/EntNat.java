package Tp_Exeptions;
public class EntNat {
    private int n;
    public EntNat(int n) throws ErrConst{
        if (n < 0){
            throw new ErrConst("this value isn't valide: ", n);
        }
        this.n = n;
    }
    public int getN(){
        return n;
    }
}

