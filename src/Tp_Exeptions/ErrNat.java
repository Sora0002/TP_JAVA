package Tp_Exeptions;


public abstract class ErrNat extends Exception {
    public ErrNat(String m){
        super(m);
    }

    // Abstract method to be implemented by subclasses
    public abstract long getN();
}


class ErrConst extends ErrNat {
    private int n;

    public ErrConst(String message, int n) {
        super(message);
        this.n = n;
    }

    @Override
    public long getN() {
        return n;
    }
}

class ErrSom extends ErrNat {
    long n;

    public ErrSom(String m, long n) {
        super(m);
        this.n = n;
    }

    @Override
    public long getN() {
        return n;
    }
}

class ErrProd extends ErrNat {
    long n;

    public ErrProd(String m, long n) {
        super(m);
        this.n = n;
    }

    @Override
    public long getN() {
        return n;
    }
}

class ErrDiff extends ErrNat {
    int n;

    public ErrDiff(String m, int n) {
        super(m);
        this.n = n;
    }

    @Override
    public long getN() {
        return n;
    }
}
