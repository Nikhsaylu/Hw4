import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        }
        if (age <= 17) {
            System.out.println("Ты несовершеннолетний, надо немного подождать");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int  temp = 5;
        if (temp >= 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        int temperature = 4;
        if (temperature <= 4) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
    }

        public static void task3() {
            System.out.println("Задача 3");
            int speedlimit = 60;
            int speed = 63;

            if (speed <= speedlimit) {
                System.out.println("Если скорость " + speed + " то, можно ездить спокойно");
            } else {
                System.out.println("Если скорость " + speed + " то придется заплатить штраф");
            }
        }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 20;
        if (age >= 2 && age <= 6) {
            System.out.println("Если человеку " + age + " то ему надо ходить в детский сад");
        }else if (age >=7 && age < 18 ) {
            System.out.println("Если человеку " + age + " то ему надо ходить в школу");
        }else if (age > 18 && age < 24) {
            System.out.println("Если человеку " + age + " то ему надо ходить в университет");
        }else if (age >24){
            System.out.println("Если человеку " + age + " то ему надо ходить на работу");
        }


    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        if (age < 5) {
            ;
            System.out.println("Если возраст ребенка" + age + " то ему нельзя кататься на аттракционах");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка " + age + " то ему можно кататься со взрослыми");
        }else {
            System.out.println("Если возраст ребенка " +age+ " то он может кататься один");
        }


    }
    public static void task6() {
        System.out.println("Задача 6");
        int totalPlacec = 102;
        int seating = 60;
        int standing = totalPlacec - seating;
        int busySeat = 32;
        int busyStand = 64;
        int availableSeat = seating - busySeat;
        int availableStand = standing - busyStand;
        if (availableSeat == 0 && availableStand ==0){
            System.out.println("В вагоне нет мест");
        }
        if (availableSeat > 0){
            System.out.println( "В вагоне" +availableSeat+ " сидячих мест");
        }
        if (availableStand > 0){
            System.out.println(" В вагоне " +availableStand+ " стоячих мест.");
        }
    }
        public static void task7() {
            System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        int max = one;
        if (two > max){
            max = two;
        }
        if (three > max){
            max = three;
        }
        System.out.println("Максимум из чисел " + one + "," + two + "," + three+ " равен " + max + ".");



    }

}