import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //z1
        /*
        double a,b,c;
        System.out.print("podaj parametr a: ");
        a =input_double();
        System.out.print("podaj parametr b: ");
        b =input_double();
        System.out.print("podaj parametr c: ");
        c =input_double();

        Quadratic_eqution.calculate_quadratic_equation(a,b,c);

         */
        //z2
        /*
        int d,e,f;
        //a

        System.out.print("podaj parametr x dla funckcji a: ");
        d =input_int();
        Functions.a_function(d);
        //b
        System.out.print("podaj parametr x dla funckcji b: ");
        e =input_int();
        Functions.b_function(e);
        //c
        System.out.print("podaj parametr x dla funckcji c: ");
        f =input_int();
        Functions.c_function(f);

         */
        //z3
        /*
        System.out.print("podaj 3 liczby: ");
        int g,h,i;
        g= input_int();
        h= input_int();
        i= input_int();

        Ordering.order(g,h,i);

         */
        //z4
        /*
        System.out.println("Czy pada deszcz? true/false");
        boolean is_raining= input_boolean();
        System.out.println("Czy jest autobus na przystanku? true/false");
        boolean is_bus_avaible= input_boolean();
        Choices.check_weather_and_bus(is_raining,is_bus_avaible);

         */
        //z5
        System.out.println("czy masz zniżkę na samochód? true/false");
        boolean car_discount= input_boolean();
        System.out.println("Dostałeś podwyżkę? true/false");
        boolean bonus= input_boolean();
        Choices.check_discount_and_bonus(car_discount,bonus);

        //z6
        /*
        System.out.println("Wybierz działanie:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Reszta z dzielenia");
        int choice = input_int();

        System.out.print("Podaj pierwszą liczbę: ");
        double num1 = input_double();

        System.out.print("Podaj drugą liczbę: ");
        double num2 = input_double();

        switch (choice) {
            case 1:
                System.out.println("Wynik dodawania: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Wynik odejmowania: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Wynik mnożenia: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Wynik dzielenia: " + (num1 / num2));
                } else {
                    System.out.println("Nie można dzielić przez zero.");
                }
                break;
            case 5:
                if (num2 != 0) {
                    System.out.println("Reszta z dzielenia: " + (num1 % num2));
                } else {
                    System.out.println("Nie można dzielić przez zero.");
                }
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
        }

         */

    }//koniec MAIN

    public static double input_double(){
        Scanner input= new Scanner(System.in);
        //System.out.printf("Podaj liczbe");
        double liczba = input.nextDouble();
        return liczba;

    }
    public static int input_int(){
        Scanner input= new Scanner(System.in);
        //System.out.printf("Podaj liczbe");
        int liczba2 = input.nextInt();
        return liczba2;

    }
    public static boolean input_boolean(){
        Scanner input= new Scanner(System.in);
        //System.out.printf("Podaj liczbe");
        boolean bool = input.nextBoolean();
        return bool;

    }








}
