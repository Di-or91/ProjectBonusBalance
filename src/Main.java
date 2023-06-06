public class Main {
    public static void main(String[] args) {
        int balance = 200; // текущий баланс
        int depositAmount = 1200; // сумма пополнения
        int bonus;

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }
        balance = balance + depositAmount + bonus;
        System.out.println("На вашем счете: " + balance + " рублей");
        System.out.println("Ваш бонус: " + bonus + " рублей");
    }
}