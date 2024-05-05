public abstract class Zwierze implements IPlywanie, ILatanie {
    @Override
    public void plyn() {
        System.out.printf("plynie");
    }

    @Override
    public void wyladuj() {
        System.out.printf("laduje");
    }

    @Override
    public void wynurz() {

    }

    @Override
    public void zanurz() {

    }

    @Override
    public void lec() {

    }
    void jedz(){
        System.out.printf("je");
    }
    void wydalaj(){
        System.out.printf("sra");
    }
}
