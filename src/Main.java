public class Main {
    public static void main(String[] args) {

        int accountBalance = 500; // сумма на балансе клиента
        int accountIncrease = 1899; // сумма пополнения счета
            if (accountIncrease >= 1100) {
                System.out.println("Вам начислено " + accountIncrease / 100 + " бонусa(ов)");
                System.out.println("Баланс вашего счета равен: " + (accountBalance + accountIncrease + accountIncrease / 100) + " рубля(ей)");
            } else {
                System.out.println("Баланс вашего счета равен: " + (accountBalance + accountIncrease) + " рубля(ей)");
                System.out.println("Вам начислено 0 бонусов");
            }

            }
    }