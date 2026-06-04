public class BankAcc {
    String accNum;
    int balance;


    BankAcc(String accNo, int bal) {
        accNum = accNo;
        balance = bal;
    }

    void display() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accNum);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        
    static String bankName = "State Bank";
        BankAcc bank1 = new BankAcc("SB1", 5000);
        BankAcc bank2 = new BankAcc("SB2", 10000);

        bank1.display();
        bank2.display();
    }
}