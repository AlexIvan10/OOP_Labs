public class BankAccount {
    int sold;
    BankAccount(int sold){
        this.sold = sold;
    }
    void retrageNumerar(int sum) throws FondInsuficientException{
        if(sum > sold){
            throw new FondInsuficientException("Fond insuficient");
        }
        else{
            sold -= sum;
        }
    }
}
