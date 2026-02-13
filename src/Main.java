public class Main {
    public static void main(String[] args) {

        int accountBalance = 600; // сумма на балансе клиента
        int accountIncrease; // сумма пополнения счета

        // Тест 1:
        accountIncrease = 1099;
        if (accountIncrease >= 1100) {
            System.out.println("Вам начислено " + accountIncrease / 100 + " бонусa(ов)");
            System.out.println("Баланс вашего счета равен: " + (accountBalance + accountIncrease + accountIncrease / 100) + " рубля(ей)");
        } else {
            System.out.println("Вам начислено 0 бонусов");
            System.out.println("Баланс вашего счета равен: " + (accountBalance + accountIncrease) + " рубля(ей)");
        }

        // Тест 2:
        accountIncrease = 1100;
        if (accountIncrease >= 1100) {
            System.out.println("Вам начислено " + accountIncrease / 100 + " бонусa(ов)");
            System.out.println("Баланс вашего счета равен: " + (accountBalance + accountIncrease + accountIncrease / 100) + " рубля(ей)");
        } else {
            System.out.println("Вам начислено 0 бонусов");
            System.out.println("Баланс вашего счета равен: " + (accountBalance + accountIncrease) + " рубля(ей)");
        }

        // Тест 3:
        accountIncrease = 1199;
        if (accountIncrease >= 1100) {
            System.out.println("Вам начислено " + accountIncrease / 100 + " бонусa(ов)");
            System.out.println("Баланс вашего счета равен: " + (accountBalance + accountIncrease + accountIncrease / 100) + " рубля(ей)");
        } else {
            System.out.println("Вам начислено 0 бонусов");
            System.out.println("Баланс вашего счета равен: " + (accountBalance + accountIncrease) + " рубля(ей)");
        }

        // Тест 4:
        accountIncrease = 1200;
        if (accountIncrease >= 1100) {
            System.out.println("Вам начислено " + accountIncrease / 100 + " бонусa(ов)");
            System.out.println("Баланс вашего счета равен: " + (accountBalance + accountIncrease + accountIncrease / 100) + " рубля(ей)");
        } else {
            System.out.println("Вам начислено 0 бонусов");
            System.out.println("Баланс вашего счета равен: " + (accountBalance + accountIncrease) + " рубля(ей)");
        }

    }
}