public class Main {
    public static void main(String[] args) {
        System.out.println("Homework4");

        System.out.println("Aufgabe 1");
        int age = 15;
        System.out.println("Если возраст человека " + age + ", то");
        if (age >= 18) {
            System.out.println("он совершеннолетний.");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Aufgabe 2");
        int temperature = 7;
        System.out.println("На улице " + temperature + ",");
        if (temperature <= 5) {
            System.out.println("нужно надеть шапку.");
        } else {
            System.out.println("можно идти без шапки.");
        }

        System.out.println("Aufgabe 3");
        int kmh = 49;
        System.out.println("Если скорость " + kmh + ", то");
        if (kmh >= 60) {
            System.out.println("придётся заплотить штраф.");
        } else {
            System.out.println("можно ездить спокойно.");
        }

        System.out.println("Aufgabe 4");
        int years = 24;
        System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить");
        if (years >= 2 && years <= 6) {
            System.out.println("в детский сад.");
        } else {
            if (years >= 7 && years <= 18)
            System.out.println("в школу.");
        }
        if (years > 18 && years < 24) {
            System.out.println("в университет.");
        } else {
            System.out.println("на работу.");
        }

        System.out.println("Aufgabe 5");
        int childYears = 3;
        System.out.println("Если возраст ребёнка равен " + childYears + ", то ему");
        if (childYears < 5) {
            System.out.println("нельзя кататься на аттракционе.");
        } else {
            if (childYears >= 5 && childYears<= 14){
                System.out.println("можно только в сопровождение взрослого.");
            }
            if (childYears >= 14) {
                System.out.println("можно без сопровождения.");
            }
        }

        System.out.println("Aufgabe 6");
        int place = 125;
        System.out.println(place);
        if (place <= 60) {
            System.out.println("Есть сидячие место.");
        } else {
            if (place > 60 && place <= 102) {
                System.out.println("Есть стоячее место.");
            } else {
                System.out.println("Нет свободных мест.");
            }
        }

        System.out.println("Aufgabe 7");
        int one = 25;
        int two = 10;
        int three = 15;
        int max;
        if (one < two) {
            max = two;
        } else {
            max = one;
        }
        if (max > three) {
            System.out.println(max);
        } else {
            System.out.println(three);
        }
    }}