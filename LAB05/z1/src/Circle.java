public class Circle {
    private double r;
    private String name="koło";
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
        return Math.PI*Math.pow(r,2);
    }
    public double obwod(double r){
        return 2*Math.PI*r;
    }
    public void view(){
        System.out.println("figura: "+name+
                " promien: "+r+
                " obwod: "+obwod(r)+
                " pole: "+pole(r));
    }

}
