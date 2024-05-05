
class Prostokat extends Figura {
	double wys=0, szer=0;
	Point x;
	Point y;
	Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
	}

	Prostokat(float wys, float szer, String kolor){
		super(kolor);
		this.wys=wys;
		this.szer =szer;
		this.punkt = new Point(0, 0);
	}

    double getPowierzchnia() {
        return (szer * wys);
    }
	public void przesun(float x, float y){
		punkt.przesun((int)x,(int)y);
	}
	public String opis(){
		return String.format("prostokąt o wymiarach %.2f  %.2f \n",wys,szer);
	}
}