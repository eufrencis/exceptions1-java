package model.Exceptions;

public class DomainException extends Exception {
    // RuntimeException o compilador nao obriga a tratar
    // Exception o compilador obriga a tratar

    public DomainException (String msg){
        super(msg);
    }
    
}
