
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {

        if (payment < 2.50) {
            return payment;
        } else {
            affordableMeals++;
            money += 2.50;
            return ((double) payment - 2.50);
        }

    }

    public double eatHeartily(double payment) {
        if (payment < 4.30) {
            return payment;
        } else {
            heartyMeals++;
            money += 4.30;
            return ((double) payment - 4.30);

        }

    }

    public boolean eatAffordably(PaymentCard card) {

        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by
        // the price, and the method returns true
        // otherwise false is returne

        if (card.takeMoney(2.50)) {
            affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by
        // the price, and the method returns true
        // otherwise false is returned
    
        if (card.takeMoney(4.30)) {
            heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            this.money += sum;
            card.addMoney(sum);

        }
        
        
    }
    

    // ...

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
