import static java.awt.AWTEventMulticaster.add;

public class Main {

    public static void main(String[] args) {

        // call the first add method and store the result into a variable called resultOne.
            int numOne = 5;
            int numTwo = 7;
            int resultOne = numOne + numTwo;

        // print resultOne.
        System.out.println(resultOne);

        // call the greeting method and store the result into a variable called resultTwo.
        String name = "John";
        String resultTwo = greeting(name);

        // print resultTwo.
        System.out.println(resultTwo);

        // call the second add method and store the result into a variable called resultThree.
            int numThree = 6;
            int numFour = 8;
            int resultThree = add(numOne, numTwo, numThree, numFour);

        // print resultThree.
        System.out.println(resultThree);
        // call the printCapitalised method.

            String toBePrinted = "hello, world!";
            printCapitalised(toBePrinted);


    }

    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @return the sum of numOne and numTwo (an integer)
     */


        public static int add(int numOne, int numTwo) {
            return numOne + numTwo;
        }

    /**
     * greeting
     * @param name - the name of a person (a String)
     * @return a greeting in the format of "Bonjour, [name]!" (a String)
     */
    public static String greeting(String name) {
        return "Bonjour, " + name + "!";
            }



    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @param numThree - an integer
     * @param numFour - an integer
     * @return the sum of numOne, numTwo, numThree, and numFour (an integer)
     */


    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        int sumOne = add(numOne, numTwo);
        int sumTwo = add(sumOne, numThree);
        int sumThree = add(sumTwo, numFour);
        return sumThree;
    }


    /**
     * printCapitalised
     * @param toBePrinted - a String that the user wishes to be printed in all caps.
     */

            public static void printCapitalised(String toBePrinted) {
                String capitalised = toBePrinted.toUpperCase();
                System.out.println(toBePrinted);
    }



}
