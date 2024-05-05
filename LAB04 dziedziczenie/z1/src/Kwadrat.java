class Kwadrat extends Prostokat{

    public Kwadrat(double dlugoscBoku){
        super(dlugoscBoku,dlugoscBoku);
    }
    public double getDlugoscBoku(){
        return this.wys;
    }

    public void setDlugoscBoku(double dlugoscBoku){

        this.wys=dlugoscBoku;
        this.szer=dlugoscBoku;
    }
    public String opis(){
        return  String.format("kwadrat o boku %.2f", getDlugoscBoku());

    }


}