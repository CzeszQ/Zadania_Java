public class Cuboid {
    private double a;
    private double b;
    private double c;
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

    public void setC(double c) {
        this.c = c;
    }
    public double getC(double c) {
        return c;
    }

    public void setB(double b) {
        this.b = b;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double pole(double a,double b,double c){
       return  2* a * b + 2* a * c +2* b * c;


    }public double objetosc(double a,double b,double c){
        return a*b*c;
    }
    public void view(){
        System.out.println("figura: "+name+
                " długosc boku a : "+a+
                " długosc boku b : "+b+
                " objetość: "+objetosc(a,b,c)+
                " pole: "+pole(a,b,c));
    }
}
