public class Main {
    public static void main(String[] args) {
        int mobileAccount = 0;
        int refill = 1100;
        int bonus;
        if (refill < 1001) {
            mobileAccount = mobileAccount + refill;
        } else {
            bonus = refill / 100;
            mobileAccount = mobileAccount + refill + bonus;
        }
        System.out.println("Сумма Вашего баланса составляет: " + mobileAccount);
    }
}
