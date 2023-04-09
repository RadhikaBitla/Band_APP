public class SBIBank implements bank
{
    public int getBalance() {
        return balance;
    }

    public SBIBank(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int balance;
    private int roi;
    private String name;
    private String password;
    private String accountNumber;
    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public Boolean addMoney(int money) {
        balance=balance+money;
        return true;
    }

    @Override
    public Boolean withdrawMoney(int money) {
        if(balance<money)
            return false;

        balance-=money;

        return true;
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int totalInternet(int loanAmount, int timeInYears)
    {
        return loanAmount * roi * timeInYears/100;
    }
}
