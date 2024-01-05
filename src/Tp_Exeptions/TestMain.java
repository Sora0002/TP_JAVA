package Tp_Exeptions;

public class TestMain {
    public static void main(String[] args) throws ErrConst {
        try{
            EntNat e = new EntNat(4);
            System.out.println("the value is: " + e.getN());
            EntNat e2 = new EntNat(-4);
            System.out.println("the value is: " + e2.getN());
        }
        catch(ErrConst e){
            System.err.println(e.getMessage() + e.getN());
        }
    }
}
