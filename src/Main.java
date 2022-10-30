public class Main {
    public static void main(String[] args) {
        //задача 1.
        System.out.println("Задача 1");
        byte a = 89;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 12_789;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 222_265_890;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 8_929_285_238_939_812L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 3.674849F;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 6.87630495172;
        System.out.println("Значение переменной f с типом double равно " + f);

        //задача 2.
        System.out.println("Задача 2");
        //Что мне делать с этими данными ?)
        byte cat = 67;
        System.out.println("Утром во время прогулки я встретил " + cat + " бродячих котов. ");
        short cash = -159;
        System.out.println("Они украли все мои деньги, заглянув в кошелек я обнаружил пропажу в " + cash + " денег.");
        int year = 27897;
        System.out.println("Да в " + year + " году живется не сладко, коты совсем обнаглели.");
        long veryMuch = 987_678_965_549L;
        System.out.println("Мне рассказывали, что когда-то давно, примерно " + veryMuch + " лет назад.");
        float aa = 27.12F;
        double bb = 2.786;
        System.out.println("Коты, не то что не умели в дроби, по типу " + aa + " или " + bb + ".");
        char cc = 569;
        System.out.println("Они даже не знали, что такое " + cc + ".");
        boolean no = false;
        System.out.println("Интересно, правда это или " + no + ".");

        //Задача 3.
        System.out.println("Задача 3");
        int lyudmilaPav = 23;
        int annaSer = 27;
        int ekaterinaAnd = 30;
        int totalStudents = lyudmilaPav + annaSer + ekaterinaAnd;
        int totalSheets = 480;
        System.out.println("На каждого ученика рассчитано " + ( totalSheets / totalStudents) +  " листов бумаги.");

        //Задача 4.
        System.out.println("Задача 4");
        int machinePerformance = 16/2; // Производительность машины в 1 минуту.
        int timeOne = 20;
        System.out.println("За " + timeOne + " минут работы машина произвела бутылок " + (timeOne * machinePerformance) + " штук");
        byte day = 1;
        int timeTwo = 60 * 24; // количество минут в сутках
        System.out.println("За " + day + " день работы машина произвела бутылок " + (timeTwo * machinePerformance) + " штук");
        day += 2; // Просто 3 дня
        int timeThree = timeTwo * 3; // количество минут в 3 сутках
        System.out.println("За " + day + " дня работы машина произвела бутылок " + (timeThree * machinePerformance) + " штук");
        byte month = 1;
        int timeFour = timeTwo * 30; // количество минут в месяце
        System.out.println("За " + month + " месяц работы машина произвела бутылок " + (timeFour * machinePerformance) + " штук");

        //Задача 5.
        System.out.println("Задача 5");
        byte cans = 120;
        short white = 2;
        short brown = 4;
        int totalClasses = cans / (white+brown); //Общее количество банок, мы делим на сумму банок на класс.
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + (white * totalClasses) + " банок белой краски и " + (brown * totalClasses) + " банок коричневой краски");

        //Задача 6.
        System.out.println("Задача 6");
        short bananaWeight = 5 * 80;
        short milkWeight = (200 / 100) * 105;
        short iceWeight = 2 * 100;
        short eggWeight = 4 * 70;
        int totalWeight = bananaWeight + milkWeight + iceWeight + eggWeight;
        System.out.println("Общий вес такого спорт-завтрака, после смешивания " + totalWeight + " грамм.");
        double weightKG = 1000.0;
        double totalWeightKG = totalWeight / weightKG;
        System.out.println("Общий вес такого спорт-завтрака, после смешивания " + totalWeightKG + " кг.");

        //задача 7.
        System.out.println("Задача 7");
        short unnecessaryWeight = 7;
        int weightGram = unnecessaryWeight * 1000; // перевод 7 кг в граммы.
        short dietOne = 250;
        short dietTwo = 500;
        System.out.println("Если спортсмен будет терять каждый день по " + dietOne + " грамм, то на похудение уйдет " + (weightGram / dietOne) + " дней.");
        System.out.println("Если спортсмен будет терять каждый день по " + dietTwo + " грамм, то на похудение уйдет " + (weightGram / dietTwo) + " дней.");
        int arithmeticMean = ((weightGram / dietOne) + (weightGram / dietTwo)) / 2;
        System.out.println("В среднем спортсмену может потребоваться " + arithmeticMean + " день для похудения.");

        //задача 8.
        System.out.println("Задача 8");
        // ЗП сотрудников
        int masha = 67_760;
        int denis = 83_690;
        int christina = 76_230;
        double percent = 1.1; // Процентная ставка повышения ЗП
        // ЗП с повышением
        double percentMasha = masha * percent;
        double percentDenis = denis * percent;
        double percentChris = christina * percent;
        short annum = 12; // Месяцев в году
        // годовой доход
        int revenueMasha = masha * annum;
        int revenueDenis = denis * annum;
        int revenueChristina = christina * annum;
        // годовой доход с повышением
        double revenuePercentMasha = (masha * percent) * annum;
        double revenuePercentDenis = (denis * percent) * annum;
        double revenuePercentChris = (christina * percent) * annum;
        // разница в доходах за год
        double differenceYearMasha = revenuePercentMasha - revenueMasha;
        double differenceYearDenis = revenuePercentDenis - revenueDenis;
        double differenceYearChris = revenuePercentChris - revenueChristina;

        System.out.println("Маша теперь получает " + percentMasha + " рублей. Годовой доход вырос на " + differenceYearMasha + " рублей");
        System.out.println("Денис теперь получает " + percentDenis + " рублей. Годовой доход вырос на " + differenceYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + percentChris + " рублей. Годовой доход вырос на " + differenceYearChris + " рублей");




        System.out.println("Домашняя работа 3. Переменные. урок 2");
    }
}