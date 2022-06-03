public class Main {
    public static void main(String[] args) {
        System.out.println(goWalking(21, -19));
        System.out.println(goWalking(19, -21));
        System.out.println(goWalking(15, 5));
        System.out.println(goWalking(46, 21));
        System.out.println(goWalking(57, 26));

        System.out.println(goWalking(generateRandomAge(), 25));
    }
    public static String goWalking (int age, int temperature){
        if ((age >= 20 && age <=45 ) && (temperature >= -20 && temperature <= 30)) {
            return "You can go for a walk";
        }else if (age <= 20 && (temperature >= 0 && temperature <= 28)) {
            return "You can go for a walk";
        }else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
            return "You can go for a walk";
        }else {
            return "Stay at home";
        }
    }
    public static int generateRandomAge(){
        int randomAge = 0 + (int) (Math.random() * 70);
        return randomAge;
    }
}