public abstract class Account {

    protected Account successor;
    protected double balance;

    public void setNext(Account account) {
        this.successor = account;
    }

}