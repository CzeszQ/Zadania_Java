public class Cone {
    private double r;
    private double h;
    private double l;

    private String name="stozek";

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }
    public double getL() {
        return l;
    }
    public String getName() {
        return name;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setH(double h) {
        this.h = h;
    }
    public void setL(double l) {
        this.l = l;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double pole(double r,double l){
        return Math.PI*Math.pow(r,2)+Math.PI*r*l;
    }
    public double objetosc(double r,double h){
        return (1.0 / 3.0) * (h * Math.PI * Math.pow(r, 2));
    }
    public void view(){
        System.out.println("figura: "+name+
                " promien: "+r+
                " tworząca:"+l+
                " objestosc: "+objetosc(r,h)+
                " pole: "+pole(r,l));
    }
}
