public class Choices {

    public static void check_weather_and_bus(boolean is_raining, boolean is_bus_avaible){
        if(is_raining && is_bus_avaible){
            System.out.println("weź parasol");
            System.out.println("Dostaniesz się na uczelnię");
        } else if (!(is_bus_avaible) && is_raining) {
            System.out.println("nie dostaniesz sie na uczlenie");
        } else if (!is_bus_avaible && !is_raining) {
            System.out.println("Dostaniesz się na uczelni");
            System.out.println("Miłego dnia i pięknej pogody");
        }

    }
    public static void check_discount_and_bonus(boolean car_discount,boolean bonus) {
        if (!car_discount || bonus) {
            System.out.println("Możesz kupić samochód !");
            System.out.println("Zniżki na samochód nie ma");
        } else if (!car_discount || !bonus) {
            System.out.println("Zakup samochód trzeba odłożyć na później...");
            System.out.println("Zniżki na samochód nie ma");
        } else {
            System.out.println("Możesz kupić samochód !");
        }
    }


}
