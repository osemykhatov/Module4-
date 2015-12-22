package Module4_1;


public class Temperarure {



    public static void main (String[] args) {

        short tempCels = 98;
        float tempFahr = 44.6f;

        float celsToFahr = 32+(1.8f * tempCels);
        float fahrToCels = Math.round((tempFahr - 32) / 1.8);



        System.out.println("When Celsius value is 98 - the same value in Fahrenheit is " + celsToFahr);
        System.out.print("When Fahrenheit value is 44.6 - the same value in Celsius is " + fahrToCels);




    }

}
