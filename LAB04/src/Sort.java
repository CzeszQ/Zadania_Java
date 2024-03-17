public class Sort {

    public static void sort_array(){
        int[] array = new int[8];
        System.out.println("podaj 8 liczb do posortowania: ");
        for (int i = 0; i < 8; i++) {
            array[i] = Input.input_int();
        }
        for (int i = 0; i < 8; i++) {
            int key = array[i];
            int j=i-1;
            while (j>=0 && array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
        Arrays_printing.print_array(array);



    }
}
