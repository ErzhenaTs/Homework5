//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //task 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        //task 2
        int clientOSforTsk2 = 0;
        int clientDeviceYear = 2015;
        if (clientOSforTsk2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOSforTsk2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOSforTsk2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        //task 3
        int year = 2021;
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год не может быть меньше 1584");
        }



        //task 4
        int deliveryDistance = 95;
        int deliveryPeriod = 1;
        if (deliveryDistance <=20) {
            System.out.println("Потребуется дней: 1");}
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: 3");
        }
        else if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        }


        //task 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }


    }
}