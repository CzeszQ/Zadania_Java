public class Orzel extends Zwierze implements ILatanie{

    @Override
    public void wyladuj() {
        System.out.printf("orzel laduje\n");
    }

    @Override
    public void lec() {
        System.out.printf("orzel leci\n");
    }
}
