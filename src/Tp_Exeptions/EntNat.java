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
    public static int sum(EntNat a, EntNat b) throws ErrSom{
        long res = a.getN() + b.getN();
        if (res > Integer.MAX_VALUE){
            throw new ErrSom("The result is too long: ", res);
        }
        return (int)res;
    }
    public static int prod(EntNat a, EntNat b) throws ErrProd{
        long p = a.getN() * b.getN();
        if (p > Integer.MAX_VALUE){
            throw new ErrProd("The prod is too long: ", p);
        }
        return (int)p;
    }
    public static int diff(EntNat a, EntNat b) throws ErrDiff{
        int d = a.getN() - b.getN();
        if (d < 0){
            throw new ErrDiff("The result is negative: ", d);
        }
        return d;
    }
}

