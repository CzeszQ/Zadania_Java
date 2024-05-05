public class Palindrom_checker {

    public static boolean is_Palindrom(){
        System.out.println("podaj slowo");
        String word = Input.input_string();

        word =word.replaceAll("\\s+","").toLowerCase();

        int lenght = word.length();
        for (int i = 0; i < lenght/2; i++) {
            if (word.charAt(i) != word.charAt(lenght - i - 1)) {
                return false;
            }
        }

        return true;
    }


}
