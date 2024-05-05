public class Orb {
    private double r;
    private String name="kula";
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double pole(double r){
        return 4*Math.PI*Math.pow(r,2);
    }
    public double objetosc(double r){
        return 4/3*Math.PI*Math.pow(r,3);
    }
    public void view(){
        System.out.println("figura: "+name+
                " promien: "+r+
                " objestosc: "+objetosc(r)+
                " pole: "+pole(r));
    }
}
