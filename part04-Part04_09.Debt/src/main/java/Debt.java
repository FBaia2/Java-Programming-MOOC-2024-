public class Debt {
    private Double balance;
    private Double interestRate;


    public Debt(double initialBalance, double initialInterestRate) {
        balance = initialBalance;
        interestRate = initialInterestRate;
        // this.balance = initialBalance;
        // this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(balance);

    }

    public void waitOneYear() {
        balance = interestRate * balance;

    }
}
