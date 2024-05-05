public class Square {
    private double a;

    private String name="prostokąt";

    public double getA() {
        return a;
    }

    public String getName() {
        return name;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double pole(double a){
        return a*a;

    }public double obwod(double a){
        return 4*a;
    }
    public void view(){
        System.out.println("figura: "+name+
                " długosc boku: "+a+
                " obwod: "+obwod(a)+
                " pole: "+pole(a));
    }
}
