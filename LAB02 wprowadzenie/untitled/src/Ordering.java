public class Ordering {
    public static void order(int x,int y,int z){
        int temp;
            if(x>y) {
            temp= x;
            x=y;
            y=temp;

            }
            else if (x>z) {
                temp = x;
                x = z;
                z = temp;
            }
            else if (y>z) {
            temp = y;
            y=z;
            z=temp;

                }
        System.out.println("Liczby w kolejności rosnącej: " + x + ", " + y + ", " + z);
    }
    }


