package Tp_Exeptions;

public class ErrConst extends Exception{
    public ErrConst(){
        super("The value isn't valide!!");
    }
    public ErrConst(String message){
        super(message);
    }
}
