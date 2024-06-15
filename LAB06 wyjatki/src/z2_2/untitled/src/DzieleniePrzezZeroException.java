public class DzieleniePrzezZeroException extends Exception{


    public DzieleniePrzezZeroException() {
        super("nie mozna dzielic przez zero");
    }

    public DzieleniePrzezZeroException(String message) {
        super(message);
    }
}
