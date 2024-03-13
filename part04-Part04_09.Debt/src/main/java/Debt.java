public class Debt {
    private double balance, interestRate;

    public Debt (double initialBalance, double initialInteresRate) {
        balance = initialBalance;
        interestRate = initialInteresRate;
    }

    public void printBalance() {
        System.out.println(balance);
    }

    public void waitOneYear() {
        balance *= interestRate;
    }

}