public class okrag extends Figura {

    private Point srodek;
    private double r;

    public okrag() {
        this.srodek= new Point();
        this.r=0.0;
    }
    public okrag(Point srodek, double r) {
        this.srodek = srodek;
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getPowieszchnia(){
        return Math.PI*Math.pow(r,2);
    }
    public double getsrednica(){
        return r*2;
    }
    public boolean wSrodku(Point point){
        double dystans = Math.pow(point.getX()-srodek.getX(),2)+Math.pow(point.getY()-srodek.getY(),2);
        return dystans <= r;
    }


}

