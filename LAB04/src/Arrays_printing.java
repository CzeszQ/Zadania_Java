public class Arrays_printing {

    public static void print_array(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + " ");
        }
    }

    public static void print_even_index_array(int[] tab) {

        for (int i = 0; i < tab.length; i += 2) {
            System.out.println(tab[i] + " ");
        }
    }

    public static void print_array_apper() {
        String[] str_tab= {"bób","chrup","nacho"};
        for (String chr : str_tab) {
            System.out.println(chr.toUpperCase());

        }
    }
}
