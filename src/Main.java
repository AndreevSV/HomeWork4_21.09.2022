public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1() {
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 3333333;
        float e = 34.5f;
        double f = 333333.55555;
            System.out.printf("Значение переменной a с типом int равно %d \n", a);
            System.out.printf("Значение переменной b с типом byte равно %d \n", b);
            System.out.printf("Значение переменной c с типом short равно %d \n", c);
            System.out.printf("Значение переменной d с типом long равно %d \n", d);
            System.out.printf("Значение переменной e с типом float равно %f \n", e);
            System.out.printf("Значение переменной f с типом double равно %f \n", f);

    }
    public static void task2() {
       float a = 27.12F;
       long b = 987_678_965_549L;
       double c = 2.786;
       boolean d = false;
       short e = 569;
       short f = -159;
       int g = 27_897;
       byte i = 67;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println(i);
    }
    public static void task3() {
        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int sumList = 480;
        System.out.println("На каждого ученика рассчитано " + sumList/ (ludmilaPavlovna+annaSergeevna+ekaterinaAndreevna) + " листов бумами");
    }
    public static void task4() {
        int performance = 16/2;
        int performance20 = performance * 20;
            System.out.println("За 20 минут машина произвела бутылок " + performance20 + " штук");
        int performance24H = 60 * 24 * performance;
            System.out.println("За 24 чама машина произвела бутылок " + performance24H + " штук");
        int performance3Day = 60 * 24 * 3 * performance;
            System.out.println("За 3 дня машина произвела бутылок " + performance3Day + " штук");
        int performance1Month = 60 * 24 * 30 * performance;
            System.out.println("За месяц машина произвела бутылок " + performance1Month + " штук");

    }
    public static void task5() {
        int paintSum = 120;
        int paintWhite = 2;
        int paintBrown = 4;
        System.out.println("В школе, где " + paintSum / (paintWhite + paintBrown) + " классов, нужно " + paintSum / (paintWhite + paintBrown) * paintWhite + " банок белой краски и " + paintSum / (paintWhite + paintBrown) * paintBrown + " банок коричневой краски");
    }
    public static void task6() {
        int banana = 5;
        int bananaWeight = 80;
        int milk = 200;
        float milkWeight = 105/100f;
        int icecream = 2;
        int icecreamWeight = 100;
        int egg = 4;
        int eggWeight = 70;
        float SumWeight = ((banana * bananaWeight) + (milk * milkWeight) + (icecream * icecreamWeight) + (egg * eggWeight));
        System.out.println("Общий вес спортивного завтрака " + SumWeight / 1000 + " килограмм");
    }
    public static void task7() {
        int loseWeight = 7000;
        int loseWeight1 = 250;
        int loseWeight2 = 500;
        int days1 = loseWeight/loseWeight1;
        System.out.println("При потере веса на 250 гр в день потребуется " + days1 + " дней");
        int days2 = loseWeight/loseWeight2;
        System.out.println("При потере веса на 500 гр в день потребуется " + days2 + " дней");
        System.out.println("В среднем при потере веса " + (loseWeight1 + loseWeight2) / 2 + " гр в день потребуется " +  (loseWeight / ((loseWeight1 + loseWeight2) / 2)) + " дней");
    }
    public static void task8() {
        double mashaSalary =67760;
        double denisSalary =83690;
        double kristinaSalary =76230;
        System.out.println("Маша теперь получает " + (mashaSalary * 1.1) + " рублей. Годовой доход вырос на " + ((mashaSalary * 0.1) * 12) + " рублей");
        System.out.println("Денис теперь получает " + (denisSalary * 1.1) + " рублей. Годовой доход вырос на " + ((denisSalary * 0.1) * 12) + " рублей");
        System.out.println("Кристина теперь получает " + (kristinaSalary * 1.1) + " рублей. Годовой доход вырос на " + ((kristinaSalary * 0.1) * 12) + " рублей");


    }
}