public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int cash = 1_000_000;
        double percent = 9.99;
        int timeOne = 1;
        int monthlyOne = (int) service.calculate(cash, percent, timeOne);
        System.out.println("Ежемесячный платеж " + monthlyOne + "р.\nСрок кредита " + timeOne + " год." +
                "\nПроцентная ставка " + percent + " %\n");

        int timeTwo = 2;
        int monthlyTwo = (int) service.calculate(cash, percent, timeTwo);
        System.out.println("Ежемесячный платеж " + monthlyTwo + "р.\nСрок кредита " + timeTwo + " года." +
                "\nПроцентная ставка " + percent + " %\n");

        int timeThree = 3;
        int monthlyThree = (int) service.calculate(cash, percent, timeThree);
        System.out.println("Ежемесячный платеж " + monthlyThree + "р.\nСрок кредита " + timeThree + " года." +
                "\nПроцентная ставка " + percent + " %\n");
    }
}