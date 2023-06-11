public class rewardValue {
    double cashValue;
    double milesValue;

    public rewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    public rewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }
    double getCashValue() {
        return cashValue;
    }

    double getMilesValue() {
        return milesValue;

    }
}
