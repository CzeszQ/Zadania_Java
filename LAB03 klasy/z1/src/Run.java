import java.util.Scanner;

public class Run {
    //metoda running kotra bedzie odpowiadac za wyswietlenei logiki
    //switch w while
    public void Running(){
        int wybor;
        while (true){
            menu();
            wybor=input_int();
            switch (wybor){
                case 1 -> viewCircle();
                case 2 -> viewSqare();
                case 3 -> viewRectangle();
                case 4 -> viewCube();
                case 5 -> viewCuboid();
                case 6 -> viewOrb();
                case 7 -> viewCone();

                default -> default_instruktor();
            }

        }
    }

    private void default_instruktor() {
        System.out.println("podano złe opcje proszę wybrać liczbe z mozliwych opcji");
        System.out.println(" 1: pole i obwod kola\n " +
                "2: pole i obwod kwadratu\n " +
                "3: pole i obwod prostokata\n " +
                "4: pole i objetosc szescianu\n " +
                "5: pole i objetosc prostopadloscian\n " +
                "6: pole i objetosc kuli\n " +
                "7: pole i objetosc stożka\n ");
    }


    private void viewCone() {
        Cone cone = new Cone();
        System.out.println("podaj promien podstawy, długosc tworzącej oraz wysokosc stozka ");
        double r =input_double();
        double l =input_double();
        double h =input_double();
        if(r>0 && l>0 && h>0){
            cone.setR(r);
            cone.setL(r);
            cone.setR(r);
        }
        else if(r<0) {
            System.out.println("podano liczbe ujemną, podaj dodatnią r:" + Math.abs(r));
            cone.setR(Math.abs(r));
        }
        else if(l<0) {
            System.out.println("podano liczbe ujemną, podaj dodatnią r:" + Math.abs(l));
            cone.setR(Math.abs(l));
        }
        else if(h<0) {
            System.out.println("podano liczbe ujemną, podaj dodatnią r:" + Math.abs(h));
            cone.setR(Math.abs(h));
        }

        cone.view();
    }

    private void viewOrb() {
        Orb orb= new Orb();
        System.out.println("podaj promien kuli:");
        double r =input_double();
        if(r>0){
            orb.setR(r);
        }
        else System.out.println("podano liczbe ujemną, podaj dodatnią r:"+Math.abs(r));
        orb.setR(Math.abs(r));
        orb.view();
    }

    private void viewCuboid() {
        Cuboid cuboid = new Cuboid();
        System.out.println("podaj długosci krawdzi a i b ic:");
        double a= input_double();
        double b= input_double();
        double c= input_double();
        if(a>0 && b>0 && c>0){
            cuboid.setA(a);
            cuboid.setB(b);
            cuboid.setC(c);
        } else if (a<0) {
            System.out.println("podano liczbe ujemną, podaj dodatnią a:" + Math.abs(a));
            cuboid.setA(Math.abs(a));
        }
        else if (b<0) {
            System.out.println("podano liczbe ujemną, podaj dodatnią b:" + Math.abs(b));
            cuboid.setB(Math.abs(b));
        }
        else if (c<0) {
            System.out.println("podano liczbe ujemną, podaj dodatnią c:" + Math.abs(c));
            cuboid.setB(Math.abs(c));
        }
        cuboid.view();
    }

    private void viewCube() {
        Cube cube = new Cube();
        System.out.println("podaj długosc krawedzi");
        double a= input_double();
        if(a>0){
            cube.setA(a);
        }
        else System.out.println("podano liczbe ujemną, podaj dodatnią r:"+Math.abs(a));
        cube.setA(Math.abs(a));
        cube.view();
    }

    private void viewRectangle() {
        Rectangle rectangle = new Rectangle();
        System.out.println("podaj długosci boków a i b:");
        double a= input_double();
        double b= input_double();
        if(a>0 && b>0){
            rectangle.setA(a);
            rectangle.setB(b);
        } else if (a<0) {
            System.out.println("podano liczbe ujemną, podaj dodatnią a:" + Math.abs(a));
            rectangle.setA(Math.abs(a));
        }
        else if (b<0) {
            System.out.println("podano liczbe ujemną, podaj dodatnią b:" + Math.abs(b));
            rectangle.setB(Math.abs(b));
        }

        rectangle.view();
    }


    private void viewSqare() {
        Square square = new Square();
        System.out.println("podaj długosc boku:");
        double a= input_double();
        if(a>0){
            square.setA(a);
        }
        else System.out.println("podano liczbe ujemną, podaj dodatnią r:"+Math.abs(a));
        square.setA(Math.abs(a));
        square.view();
    }

    private void viewCircle() {
        Circle circle= new Circle();
        System.out.println("podaj promien:");
        double r =input_double();
        if(r>0){
            circle.setR(r);
        }
        else System.out.println("podano liczbe ujemną, podaj dodatnią r:"+Math.abs(r));
        circle.setR(Math.abs(r));
        circle.view();
    }


    public void menu(){
        System.out.println("Menu programu");
        System.out.println("podaj numer");
        System.out.println(" 1: pole i obwod kola\n " +
                "2: pole i obwod kwadratu\n " +
                "3: pole i obwod prostokata\n " +
                "4: pole i objetosc szescianu\n " +
                "5: pole i objetosc prostopadloscian\n " +
                "6: pole i objetosc kuli\n " +
                "7: pole i objetosc stożka\n ");

    }
    public int input_int(){
        Scanner scanner= new Scanner(System.in);
        int liczba= scanner.nextInt();
        return liczba;

    }public double input_double(){
        Scanner scanner= new Scanner(System.in);
        double liczba= scanner.nextDouble();
        return liczba;
    }
}
