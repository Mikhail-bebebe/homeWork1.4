public class Main {
    public static void main(String[] args) {
        //задание 1
        int number = 0;
        while (number < 10) {
            System.out.print(++number + " ");
        }
        System.out.println();
        for (;number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
        //задание 2

        for (int friday = 3; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет.");
        }
        //задание 3
        int thisYear = 2024;
        int twoHundredYearsAgo = thisYear - 200;
        int oneHundredYearsAhead = thisYear + 100;
        for (int year = 0; year <= oneHundredYearsAhead; year = year + 79) {
            if (year > twoHundredYearsAgo) {
                System.out.println(year);
            }
        }
    }
}