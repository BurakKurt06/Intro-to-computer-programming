public class Main
{
    public static void main(String [] args)
    {
        double numDouble = 89012.3456789;
        System.out.println("numDouble = " + numDouble);

        //#rounding
        System.out.println("\nRounding");
        System.out.println("--------------------");
        //#casting & converting
        //#order of primative data ranking (p. 93)
        System.out.println("\n\nCasting & Converting");
        System.out.println("--------------------");
        int numOneInt;

        //#example of placing lower ranked data type into higher
        //#No casting necessary

        //#numOne = num1; can't do this...possible loss of precision

        //#integer division
        System.out.println("\n\nInteger Division");
        System.out.println("----------------");
        double result = 1/2 * 10;

        /*#WHAT? not right; 1/2 is not .5 bc it is an integer so 
         * it equals 0; 0 * 10= 0
         * and int divided by an int is an int 1/2 = 0
         */
        
        //#try again
        
        //#Use of finals
        //# use ALL_UPPER_CASE and the key word final.
        //# finals can not be changed programmatically.
        System.out.println("\n\nfinal CONSTANTS");
        System.out.println("----------------");
        
    }
}