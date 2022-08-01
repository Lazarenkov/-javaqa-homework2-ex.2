public class Main {
    public static void main(String[] args) {
        int amount = 100; //первоначальный баланс
        int payment = 1025; //сумма платежа

        int bonus;
        if (payment>=1000) {
                bonus=payment/100;
        } else {
                bonus = 0;
        }


        System.out.println("Сумма платежа - " + payment + " рублей.");
        System.out.println("Текущий баланс - " + (amount+payment) + " рублей.");

        if (bonus>0) {
            System.out.println("Начислено " + (bonus) + " бонусов.");
    } else {
            System.out.println("Бонусы не начислены, пополнение менее чем на 1000 руб.");
        }
    }



}
