public class Wieloryb extends Ryba implements IPlywanie {
    @Override
    void jedz() {
        System.out.printf("Wieloryb je plankton\n");
    }

    @Override
    void wydalaj() {
        System.out.printf("Wieloryb wydala plankton\n");
    }

    @Override
    public void plyn() {
        System.out.printf("wieloryb plynie\n");
    }

    @Override
    public void wynurz() {
        System.out.printf("plusk wody po wynurzeniu\n");
    }

    @Override
    public void zanurz() {
        System.out.printf("dzwiek pluskania wody\n");
    }
}
