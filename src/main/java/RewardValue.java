public class RewardValue {
    private final double cashValue;
    public static final double RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int miles) {
        this.cashValue = miles * RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int) (cashValue / RATE);
    }
}
