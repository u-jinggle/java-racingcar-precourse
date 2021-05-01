public class Util
{
    private Util(){}
    private static String failValidStringLength = "자동차 이름은 5글자 이하로 설정 가능합니다.";

    public static void checkValidStringLength(String carName){
        if(carName.length() > 5){
            throw new IllegalArgumentException(failValidStringLength);
        }
    }
}
