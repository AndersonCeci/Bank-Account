public class BankAccount {
    private double checkingBalance;
    private double savingBalance;

    private static int numberOfAccounts = 0;
    private static double trackMoneyAccount = 0;

    BankAccount(){
        numberOfAccounts++;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingBalance(){
        return this.savingBalance;
    }

    public void addMoney(double amount){
        if (amount > 0){
            checkingBalance += amount;
            trackMoneyAccount += amount;

        }
    }

    public void addMoney2(double amount){
        if (amount > 0){
            savingBalance += amount;
            trackMoneyAccount += amount;
        }
    }

    public void withdrawMoney(double amount){
        if(amount >0){
            if (checkingBalance >= amount){
                checkingBalance -= amount;
                trackMoneyAccount -= amount;
            }

        }
    }

    public static double getBalance(){
        return trackMoneyAccount;
    }
}
