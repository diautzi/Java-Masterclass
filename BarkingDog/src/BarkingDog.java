public class BarkingDog {

    public static boolean bark(boolean barking, int hourOfDay){
        boolean result = false;
        if (hourOfDay < 0 || hourOfDay > 23){
            System.out.println("1st Condition");
            return false;
        }
        else if (hourOfDay >= 8 && hourOfDay <= 22){
            System.out.println("2nd Condition");
            result = false;
        }

        else if (hourOfDay >= 1 || hourOfDay <=7 || hourOfDay >=23){
            if(barking == true){
                System.out.println("3rd Condition");
                result = true;
            }
            else {
                System.out.println("4th Condition");
                result = false;
            }
        }
        return result;


    }

}