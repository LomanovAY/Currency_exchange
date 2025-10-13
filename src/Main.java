import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // 1. Ввод суммы
        // 2. Выбор варианта доллар/евро
        // 3. Посчитать итоговое значение(суммы*курс доллар/евро)
        // 4. Сохранить в приложении курс доллара и евро
        start();

    }
    static void start (){
    System.out.print("Введите сумму: ");
    Scanner scanner = new Scanner(System.in);
    int valueSum = scanner.nextInt();

        System.out.println("Выберите нужную валюту:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        int choiceType = scanner.nextByte();
        String result = convertCurrency(valueSum, choiceType);
        int dotIndex = result.indexOf(".");
        String finalResult = result.substring(0,dotIndex + 2);

        System.out.println("По текущему курсу сумма составит: " + finalResult);
        start();
    }
    static String convertCurrency(int valueSum, int choiceType){
        double rubToUsd = 0.012;
        double rubToEur = 0.011;
        switch (choiceType){
            case 1:
                double usdResult = valueSum * rubToUsd;
                return String.valueOf(usdResult);
            case 2:
                double eurResult = valueSum * rubToEur;
                return String.valueOf(eurResult);
        }
        return "0";
    }

}
