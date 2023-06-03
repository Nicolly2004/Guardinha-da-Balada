package exceptions;

public class ForbidenAccessException extends Exception{
    private int codeError = 203;
    public  ForbidenAccessException(){
        super("Você não esta autorizado a entrar");
    }

    public int getCodeError(){
        return codeError;
    }
}
