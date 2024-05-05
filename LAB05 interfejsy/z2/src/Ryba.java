public abstract class Ryba extends Zwierze implements IPlywanie {
    @Override
    void jedz(){
        System.out.printf("ryba je");
    }
    @Override
    void wydalaj(){
        System.out.printf("dzwieki wydalania ryby");
    }


    @Override
    public void plyn() {
        System.out.printf("ryba plynie");
    }
    @Override
    public void wynurz(){
        System.out.printf("ryba wynurza sie bul bul");
    }

    @Override
    public void zanurz() {
        System.out.printf("bul bul bul");
    }
}
