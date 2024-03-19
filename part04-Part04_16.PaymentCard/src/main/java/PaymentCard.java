public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
        // write code here
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        if (balance >= 2.60) {
            balance -= 2.60;
        }

    }

    public void eatHeartily() {
        if (balance >= 4.60) {
            balance -= 4.60;
        }

    }

    public void addMoney(double amount) {
        if (amount < 0) {

        } else if (balance + amount > 150.0) {
            balance = 150.0;
        } else {
            balance += amount;
        }

    }
}