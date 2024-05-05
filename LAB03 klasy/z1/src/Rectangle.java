public class Rectangle {

    private double a;
    private double b;
    private String name="prostokąt";

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public String getName() {
        return name;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double pole(double a,double b){
        return a*b;

    }public double obwod(double a,double b){
        return 2*a+2*b;
    }
    public void view(){
        System.out.println("figura: "+name+
                " długosc boku a : "+a+
                " długosc boku b : "+b+
                " obwod: "+obwod(a,b)+
                " pole: "+pole(a,b));
    }
}
