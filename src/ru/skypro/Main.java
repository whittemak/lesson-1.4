package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        int friday = 3;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + " необходимо подготовить отчет");
        }
        System.out.println();
        int currentYear = 2022;
        int yearBefore = currentYear - 200;
        int yearAfter = currentYear + 100;
        int y = 0;
        for (; y <= yearAfter; y = y + 79) {
            if (y >= yearBefore && y <= yearAfter) {
                System.out.println(y + " год");
            }

        }
    }

}

