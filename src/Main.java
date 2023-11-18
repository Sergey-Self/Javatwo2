public class Main {
    public static void main(String[] args) {

        int clientAccount = 250; // Начальная сумма на счёте
        int addClientAccount = 1500; // Сумма пополнения
        int oneHundred = 100; // Бонус 1 рубль за каждые 100 рублей

        int bonus;
        if (addClientAccount > 1000) {
            bonus = addClientAccount / oneHundred; // При сумме пополнения свыше 1000 рублей
        } else {
            bonus = 0; // При сумме пополнения менее 100 рублей
        }

        System.out.println("Баланс: " + (clientAccount + addClientAccount + bonus) + " рублей.");
        System.out.println("Бонус: " + bonus + " рублей.");
    }
}