public class AreaCalculator {
    public static double area(double radius){           //CIRCLE
        if(radius < 0){
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){      //RECTANGLE
        if(x<0 || y<0){
            return -1;
        }
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(area(8));
        System.out.println(area(10, 9));
        System.out.println(area(-8)); //ERROR TEST
        System.out.println(area(-10, -9)); //ERROR TEST
        System.out.println(area(-10 , 9 )); //ERROR TEST
        System.out.println(area(10, -9)); //ERROR TEST
    }
}
