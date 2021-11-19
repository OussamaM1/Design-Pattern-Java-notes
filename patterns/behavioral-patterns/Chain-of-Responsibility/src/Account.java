public abstract class Account {

    protected Account successor;
    protected double balance;

    public void setNext(Account account) {
        this.successor = account;
    }

    public void pay(double montant) throws Exception {
        if (this.canPay(montant)) {
            System.out.println("Paid " + montant + " using " + getClass().getName());
        } else if (this.successor != null) {
            System.out.println("Cannot pay " + montant + " using " + getClass().getName() + " Proceeding...");
            this.successor.pay(montant);
        } else {
            throw new Exception("None of the accounts have enough balance");
        }
    }

    public boolean canPay(double montant) {
        return this.balance >= montant ? true : false;
    }

}