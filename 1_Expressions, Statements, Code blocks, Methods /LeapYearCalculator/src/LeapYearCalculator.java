public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {

        if ( year < 1 || year > 9999) {
            return false;
        }

        if(year % 4 == 0) {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
        else {
            return false;
        }
    }
}
