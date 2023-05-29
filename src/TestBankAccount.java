public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();


        account1.addMoney(16.13);
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingBalance());
    }
}
