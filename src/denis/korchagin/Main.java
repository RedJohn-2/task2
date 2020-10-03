package denis.korchagin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int age = readAge();
        System.out.println(transformAgeToDescriptionString(age));
    }

    static int readAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input age ");
        return scanner.nextInt();
    }

    static String transformAgeToDescriptionString(int age) {
        if (age >= 10 && age <= 19) return transformNumberFrom10To19(age) + "лет";
        return transformNumberOfTens(age) + transformNumberOfUnits(age) + transformWordYear(age);
    }

    static String transformNumberFrom10To19(int age) {
        String[] numberFrom10To19 = {"десять ","одиннадцать ","двенадцать ","тринадцать ",
                                    "четырнадцать ","пятнадцать ", "шестнадцать ","семнадцать ",
                                    "восемнадцать ","девятнадцать "};
        return numberFrom10To19[age%10];
    }

    static String transformNumberOfTens(int age) {
        String[] numberOfTens = {"","","двадцать ","тридцать ","сорок ","пятьдесят ","шестьдесят ",
                                "семьдесят ","восемьдесят ","девяносто "};
        return numberOfTens[age/10];
    }

    static String transformNumberOfUnits(int age) {
        String[] numberOfUnits = {"", "один ", "два ", "три ", "четыре ", "пять ", "шесть ",
                                 "семь ", "восемь ", "девять "};
        return numberOfUnits[age % 10];
    }

    static String transformWordYear(int age) {
        String[] WordYear = {"лет", "год", "года", "года", "года", "лет", "лет",
                            "лет", "лет", "лет"};
        return WordYear[age % 10];
    }

}
