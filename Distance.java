package Module4_1;


public class Distance {

    public static void main(String[] args) {

        // Point's A co-ordinate
        int x1 =  10;
        int y1 = 7;

        // Point's B co-ordinate
        int x2 = 17;
        int y2 = 15;




        double distance = Math.sqrt(Math.pow((x2-x1 ),2) + Math.pow((y2-y1 ),2));


        System.out.println("Distance between point is " + distance);

    }
}
