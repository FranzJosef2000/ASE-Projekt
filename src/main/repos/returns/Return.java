package main.repos.returns;

public abstract class Return {
    protected boolean successful;

    public Return(boolean successful){
        super();
        this.successful= successful;
    }
    public boolean isSuccessful(){return successful;}
}
