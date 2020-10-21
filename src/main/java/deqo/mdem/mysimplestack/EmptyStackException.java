package deqo.mdem.mysimplestack;

public class EmptyStackException extends Exception{
    public EmptyStackException(){
        super();
    }
    public EmptyStackException(String msg, Throwable cause){
        super(msg, cause);
    }

    public EmptyStackException(String msg){
        super(msg);
    }

    public EmptyStackException(Throwable cause){
        super(cause);
    }
}
