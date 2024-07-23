//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }System.out.println("Задача 1");
        byte x = -100;
        System.out.println("Значение переменной Х с типом byte равно " + x);
        short y = 2150;
        System.out.println("Значение переменной Y с типом short равно " + y);
        int z = -35000;
        System.out.println("Значение переменной Z с типом int равно " + z);
        long w = 240000000;
        System.out.println("Значение переменной W с типом long равно " + w);
        float weight = 1.5f;
        System.out.println("Значение переменной Weight с типом float равно " + weight);
        double size = 1.55f;
        System.out.println("Значение переменной Size с типом double равно " + size);
        System.out.println("Задача 2");
        byte h = 67;
        short d = 569;
        short f = -159;
        int g = 27897;
        long b = 987678965549l;
        float a = 27.12f;
        double c = 2.786f;
        System.out.println("Задача 3");
        byte studentLP = 23;
        byte studentAS = 27;
        byte studentKA = 30;
        short totalPaper = 480;
        int studentPaper = totalPaper/(studentLP + studentAS + studentKA);
        System.out.println("На каждого ученика расчитано " + studentPaper + " листов бумаги.");
        System.out.println("Задача 4");
        byte bottleMinute = 16 / 2;
        int productivity20min = 20 * bottleMinute;
        System.out.println("За 20 минут машина произвела " + productivity20min + " штук бутылок.");
        int productivityDay = 24 * 60 * bottleMinute;
        System.out.println("За сутки машина произвела " + productivityDay + " штук бутылок.");
        int productivity3Day = 24 * 3 * 60 * bottleMinute;
        System.out.println("За 3 суток машина произвела " + productivity3Day + " штук бутылок.");
        int productivityMonth = 24 * 30 * 60 * bottleMinute;
        System.out.println("За месяц машина произвела " + productivityMonth + " штук бутылок.");
        System.out.println("Задача 5");
        byte paintWhite = 2;
        byte paintBrown = 4;
        short paintTotal = 120;
        int classSchool = paintTotal / (paintBrown + paintWhite);
        int totalWhite = classSchool * paintWhite;
        int totalBrown = classSchool * paintBrown;
        System.out.println("В шклоле, где " + classSchool + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");
        System.out.println("Задача 6");
        byte bananas = 5;
        int weightBananas = bananas * 80;
        short milk = 200;
        double weightMilk = milk * 1.05;
        byte iceCream = 2;
        int weightIceCream = iceCream * 100;
        byte aggs = 4;
        int weightAggs = aggs * 70;
        double totalGram = weightBananas + weightMilk + weightIceCream + weightAggs;
        double totalKilo = (weightBananas + weightMilk + weightIceCream + weightAggs)/1000;
        System.out.println("Вес спортзавтрака " + totalGram + " грамм или " + totalKilo + " килограмм.");
        System.out.println("Задача 7");
        byte slimKilo = 7;
        int daySlim1 = 7 * 1000 / 250;
        System.out.println("Если терять по 250 грамм каждый день, то понадобится " + daySlim1 + " дней для похудения на 7 кг.");
        int daySlim2 = 7 * 1000 / 500;
        System.out.println("Если терять по 500 грамм каждый день, то понадобится " + daySlim2 + " дней для похудения на 7 кг.");
        float averageDaySlim = (daySlim1 + daySlim2) / 2;
        System.out.println("Что бы добится результата похудения понадобится в среднем " + averageDaySlim + " дней.");
        System.out.println("Задача 8");
        int incomeMashaMonth = 67760;
        double riseIncomeMashaMonth = incomeMashaMonth * 0.1;
        double incomeMashaYear = incomeMashaMonth + riseIncomeMashaMonth;
        double riseIncomeMashaYear = riseIncomeMashaMonth * 12;
        System.out.println("Маша теперь получает " + incomeMashaYear + " рублей. Годовой доход вырос на " + riseIncomeMashaYear + " рублей.");
        int incomeDenisMonth = 83690;
        double riseIncomeDenisMonth = incomeDenisMonth * 0.1;
        double incomeDenisYear = incomeDenisMonth + riseIncomeDenisMonth;
        double riseIncomeDenisYear = riseIncomeDenisMonth * 12;
        System.out.println("Денис теперь получает " + incomeDenisYear + " рублей. Годовой доход вырос на " + riseIncomeDenisYear + " рублей.");
        int incomeKristiMonth = 76230;
        double riseIncomeKristiMonth = incomeKristiMonth * 0.1;
        double incomeKristiYear = incomeKristiMonth + riseIncomeKristiMonth;
        double riseIncomeKristiYear = riseIncomeKristiMonth * 12;
        System.out.println("Маша теперь получает " + incomeKristiYear + " рублей. Годовой доход вырос на " + riseIncomeKristiYear + " рублей.");



    }
}
