public class Main {
    public static void main(String[] args) {
        Point point= new Point();
        //System.out.println("x: "+point.x+" y: "+point.y);

        Point[] points= new Point[]{
          new Point(),
          new Point(2.5,-3.26),
          new Point(6.5,8.3),
        };
        /*
        for (Point item: points){
            item.opis();
        }

        for (Point item: points){
            item.zeruj();
        }
         */



        Prostokat prostokat = new Prostokat(5,2,"bialy");
        //System.out.println(prostokat.getPowierzchnia());

        //Trojkat trojkat = new Trojkat(7.8, 5.70);
       // System.out.println("wysokosc "+trojkat.wys+" podstawa: "+ trojkat.podst);

        Prostokat prostokat1 = new Prostokat(4, 6);

        // Przesunięcie prostokąta
        prostokat1.przesun(3, 6);

        // Wyświetlenie informacji o prostokącie po przesunięciu
        System.out.println("Po przesunięciu:");
        System.out.println("Współrzędne punktu: (" + prostokat1.punkt.x + ", " + prostokat1.punkt.y + ")");
        Kwadrat kwadrat= new Kwadrat(5);
        System.out.println(kwadrat.opis());
        System.out.println(prostokat.opis());
    }
}