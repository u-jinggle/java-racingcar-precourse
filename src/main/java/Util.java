public class Util {

    private Util() {}

    private static final String FAIL_VALID_STRING_LENGTH = "자동차 이름은 5글자 이하로 설정 가능합니다.";
    private static final String FAIL_VALID_CARS_NUM = "한대 이상의 자동차 등록시 경주가 가능합니다.";
    private static final String FAIL_VALID_PLAY_NUM = "시도할 회수는 1 이상이어야 합니다.";

    public static void checkValidStringLength(String carName) throws IllegalArgumentException {
        if (carName.length() > 5) {
            throw new IllegalArgumentException(FAIL_VALID_STRING_LENGTH);
        }
    }

    public static String[] stringToArray(String inputCars) {
        return inputCars.split(",");
    }

    public static void checkCarsNum(String[] carNameArray) throws IllegalArgumentException {
        if (carNameArray.length < 2) {
            throw new IllegalArgumentException(FAIL_VALID_CARS_NUM);
        }
    }

    public static void checkPlayNum(Integer playNum) {
        if (playNum < 1) {
            throw new IllegalArgumentException(FAIL_VALID_PLAY_NUM);
        }
    }
}