public class CreditPaymentService {
    public double calculate(int cash, double percent, int time) {
        int month = time * 12;
        double perMonth = percent / 12 / 100;
        double perMonthOne = perMonth + 1;
        int monthMin = -1 * month;
        double intPeriod = Math.pow(perMonthOne, monthMin);
        return cash * perMonth / (1 - intPeriod);
    }
}
