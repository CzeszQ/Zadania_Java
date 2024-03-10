public class Quadratic_eqution {
    public static void  calculate_quadratic_equation(double a,double b, double c){

        double delta = Math.pow(b,2)-4*a*c;
        if(delta>0) {
            double sqr_delta= Math.sqrt(delta);
            double x1=(-b-sqr_delta)/(2*a);
            double x2=(-b+sqr_delta)/(2*a);
            System.out.println("pierwiastek ma 2 pierwiastki "+x1+" oraz "+x2);

        }
        else if(delta==0){
            double x =-b/(2*a);
            System.out.println("rówananie ma jeden pierwiatek"+ x);

        }
        else{
            System.out.println("rownanie nie ma pierwiastkow");
        }


    }





}
