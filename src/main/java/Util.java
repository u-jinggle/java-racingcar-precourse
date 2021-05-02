import java.util.Random;

public class Util
{
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 9;
    private static Random random = new Random();

    private Util(){}

    private static final String FAIL_VALID_STRING_LENGTH = "자동차 이름은 5글자 이하로 설정 가능합니다.";

    public static void checkValidStringLength(String carName){
        if(carName.length() > 5){
            throw new IllegalArgumentException(FAIL_VALID_STRING_LENGTH);
        }
    }

    public static String[] stringToArray(String inputCars) {
        return inputCars.split(",");
    }

    public static Integer createRandomInt() {
        return random.nextInt(RANDOM_MIN+RANDOM_MAX+1) + RANDOM_MIN;
    }
}