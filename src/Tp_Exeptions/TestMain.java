package Tp_Exeptions;

public class TestMain {
    public static void main(String[] args) throws ErrNat {
        try{
            EntNat e = new EntNat(4);
            System.out.println("the value is: " + e.getN());
            EntNat e2 = new EntNat(-4);
            System.out.println("the value is: " + e2.getN());
        }
        catch(ErrNat e){
            System.err.println("Exception Caught: " + e.getMessage());
        }
        try{
            EntNat a = new EntNat(Integer.MAX_VALUE);
            EntNat b = new EntNat(45);
            System.out.println("the diff result is: " + EntNat.diff(a, b));
            System.out.println("the diff result is: " + EntNat.diff(b, a));
            System.out.println("the result of the sum is : " + EntNat.sum(a, b));
            System.out.println("the prod result of is : " + EntNat.prod(a, b));


        }catch (ErrConst | ErrSom | ErrDiff | ErrProd e){
            System.err.println(e.getMessage() + "\n the res is: " + e.getN());
        }
    }
}
