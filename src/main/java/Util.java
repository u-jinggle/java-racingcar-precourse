public class Util {

    private Util() {}

    private static final String FAIL_VALID_STRING_LENGTH = "자동차 이름은 5글자 이하로 설정 가능합니다.";

    public static void checkValidStringLength(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException(FAIL_VALID_STRING_LENGTH);
        }
    }

    public static String[] stringToArray(String inputCars) {
        return inputCars.split(",");
    }
}