public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
        // casting as int is done to make sure numbers after decimal point get deleted.
        // more advanced java libraries are available to perform this function

        if ((int) (firstNum * 1000) == (int) (secondNum * 1000)) {
            return true;
        } else {
            return false;
        }
    }
}
