public class Variables {
    public static void main(String[] args) {

        double dog = 8;  //для выполнения задачи 3 понадобилось изменить тип переменной с var на double, чтобы вывести дробное значение
        System.out.println("dog = "+dog);
        var cat = 3.6;
        System.out.println("cat = "+cat);
        var paper = 763789;
        System.out.println("paper = "+paper);

        dog = dog + 4;
        System.out.println("dog = "+dog);
        cat = cat + 4;
        System.out.println("cat = "+cat);
        paper = paper + 4;
        System.out.println("paper = "+paper);

        dog = dog - 3.5; //для выполнения задачи 3 понадобилось изменить тип переменной с var на double, чтобы вывести дробное значение
        System.out.println("dog = "+dog);
        cat = cat - 1.6;
        System.out.println("cat = "+cat);
        paper = paper - 7639;
        System.out.println("paper = "+paper);

        var friend = 19; //инициализация переменной friend
        System.out.println("friend = " +friend);
        friend = friend + 2;
        System.out.println("friend = " +friend);
        friend = friend / 3;
        System.out.println("friend = " +friend);

        var frog = 3.5; //инициализация переменной frog
        System.out.println("frog = " +frog);
        frog = frog * 10;
        System.out.println("frog = " +frog);
        frog = frog / 3.5;
        System.out.println("frog = " +frog);
        frog = frog + 4;
        System.out.println("frog = " +frog);

        //итоговое задание

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxerTotalWeight = boxer1 + boxer2;
        System.out.println("Суммарный вес боксеров = " + boxerTotalWeight + "кг.");
        var boxerDifferenceWeight = boxer2 - boxer1;
        System.out.println("Способ 1. Разница в весе боксеров = " + boxerDifferenceWeight + "кг.");
        boxerDifferenceWeight = boxer2 % boxer1;
        System.out.println("Способ 2. Разница в весе боксеров = " + boxerDifferenceWeight + "кг.");
    }
}