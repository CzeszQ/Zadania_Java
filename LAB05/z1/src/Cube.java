public class Cube {
    private double a;
    private String name;

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

    public double pole(double a) {
        return 6 * a * a;

    }

    public double objetosc(double a) {
        return a * a * a;
    }

    public void view() {
        System.out.println("figura: " + name +
                " długosc krawedzi : " + a +
                " obwod: " + pole(a) +
                " pole: " + objetosc(a));
    }
}