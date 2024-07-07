public class Main {
    public static void main(String[] args) {
        //Задача 1: Сколько месяцев надо, чтоб накопить кучу денег
        System.out.println("Задача 1");
        int total = 0;
        int goal = 2_459_000;
        int step = 15_000;
        int month = 0;
        while (total < goal) {
            month = month + 1;
            total += step;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total);
        }
        //Задача 2: Просчёт 1 ~ 10; 10 ~ 1
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int x = 10; x > 0; x--) {
            System.out.print(x + " ");
        }
        System.out.println();
        //Задача 3: Посчитать изменение населения за 10 лет учитывая рождаемость и смертность
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = population / 1000 * 17;
        int decayRate = population / 1000 * 8;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + birthRate - decayRate;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        //Задача 4: Накопление по вкладу до 12 миллионов
        System.out.println("Задача 4");
        int savings = 15_000;
        int goalMoney = 12_000_000;
        int monthSaving = 0;
        while (savings < goalMoney) {
            monthSaving = monthSaving + 1;
            savings = savings + (savings / 100 * 7);
            System.out.println("Месяц " + monthSaving + " сумма накоплений составляет " + savings);
        }
        //Задача 5: Накопления выведены за каждые полгода
        System.out.println("Задача 5");
        int savingsHalfYearly = 15_000;
        int goalMoneyHalfYearly = 12_000_000;
        int monthSavingHalfYearly = 0;
        while (savingsHalfYearly < goalMoneyHalfYearly) {
            monthSavingHalfYearly = monthSavingHalfYearly + 1;
            savingsHalfYearly = (int) (savingsHalfYearly * 1.07);
            if (monthSavingHalfYearly % 6 == 0) {
                System.out.println("Месяц " + monthSavingHalfYearly + " сумма накоплений составляет " + savingsHalfYearly);
            }
        }
        //Задача 6: подсчёт накоплений за 9 лет под 7% ежемесячно
        System.out.println("Задача 6");
        int moneyVasiliy = 15_000;
        int yearsToSave = 0;
        int monthsToSave = 0;
        while (yearsToSave < 9) {
            monthsToSave = monthsToSave + 1;
            moneyVasiliy = (int) (moneyVasiliy * 1.07);
            if (monthsToSave % 6 == 0) {
                System.out.println("Месяц " + monthsToSave + " сумма накоплений составляет " + moneyVasiliy);
                if (monthsToSave % 12 == 0) {
                    yearsToSave = yearsToSave + 1;
                }
            }
        }
        //Задача 7: Напоминалка про пятничный еженедельный отчёт
        System.out.println("Задача 7");
        int friday = 5;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        } while (friday <= 31);
        //Задача 8: Отчёт о пролёте кометы над Землёй каждые 79 лет
        System.out.println("Задача 8");
        int startingYear = 2024 - 200;
        int endingYear = 2024 + 100;
        int cometYear;
        for (cometYear = startingYear; cometYear <= endingYear; cometYear++) {
            if (cometYear % 79 == 0) {
                System.out.println(cometYear);
            }
        }

    }
}
