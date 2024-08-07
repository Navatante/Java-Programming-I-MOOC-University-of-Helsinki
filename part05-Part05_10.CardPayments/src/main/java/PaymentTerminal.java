
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double affodableMealPrice = 2.5;
        if (card.balance()>=affodableMealPrice) {
            this.affordableMeals++;
            return card.takeMoney(affodableMealPrice);
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double heartilyMealPrice = 4.3;
        if (card.balance()>=heartilyMealPrice) {
            this.heartyMeals++;
            return card.takeMoney(heartilyMealPrice);
        } else {
            return false;
        }
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double affodableMealPrice = 2.5;
        if (payment<affodableMealPrice) {
            return payment;
        } else {
            this.affordableMeals++;
            this.money+=affodableMealPrice;
            return payment-affodableMealPrice;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double heartilyMealPrice = 4.3;
        if (payment<heartilyMealPrice) {
            return payment;
        } else {
            this.heartyMeals++;
            this.money+=heartilyMealPrice;
            return payment-heartilyMealPrice;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum>0) {
            card.addMoney(sum);
            this.money+=sum;
        }
        
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
