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
        int LyudmilaPav = 23;
        int AnnaSer = 27;
        int EkaterinaAnd = 30;
        int totalStudents = LyudmilaPav + AnnaSer + EkaterinaAnd;
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















        System.out.println("Hello world!");
    }
}