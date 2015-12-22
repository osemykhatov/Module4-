package Module4_1;


public class Calculation {

    public static void main(String[] args) {


        short heightTriangle = 10;
        short baseTriangle = 20;
        int areaTriangle =  (heightTriangle * baseTriangle) / 2;

        short sideA = 5;
        short sideB = 17;
        int areaRectangle = sideA * sideB;

        short radiusCircle = 9;
        double areaCircle = Math.PI * Math.pow(radiusCircle,2);



        System.out.println("Area of triangle is " + areaTriangle);
        System.out.println("Area of rectangle is " + areaRectangle);
        System.out.println("Area of a circle is " + areaCircle);
    }




    }


