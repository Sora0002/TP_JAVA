package Tp_Exeptions;

public class TestMain {
    public static void main(String[] args) throws ErrConst {
        try{
            EntNat e = new EntNat(-2);
        }
        catch(ErrConst e){
            System.err.println(e.getMessage());
        }
    }
}
