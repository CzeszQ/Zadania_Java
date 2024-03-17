public class Student_points {
    public static void count_points() {
        System.out.println("podaj liczbe studentow");
        int number_of_students = Input.input_int();
        int[] studenci = new int[number_of_students];

        int i = 0;

        double number_of_points = 0;
        while (i < studenci.length) {
            System.out.println("podaj liczbe punktów dla kolejnych studenów: ");
            number_of_points = Input.input_double();
            number_of_points += number_of_points;
            i++;

        }
        double mean = number_of_points / number_of_students;
        System.out.println(mean);


    }
}
