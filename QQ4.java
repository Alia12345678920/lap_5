public class QQ4 {
    private double balance,rate;

    public QQ4()
    {
        balance=0;
    }
    public QQ4 (double initialBalance)
    {
        balance=initialBalance;
    }
    public  void addInsert(double rate)
    {
        balance=balance+balance*(rate/100);
    }
    public  double getBalance()
    {
        return balance;
    }
}
