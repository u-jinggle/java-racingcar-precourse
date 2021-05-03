import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UtilTest {
    @Test
    @DisplayName(",로 연결된 입력받은 문자열을 배열 형태로 변환하는 Test")
    void stringToArrayTest() {
        String INPUT_CARS = "kim,lee,park";
        String[] carsArray = Util.stringToArray(INPUT_CARS);

        assertThat(carsArray).contains("kim", "lee", "park");
    }

    @Test
    @DisplayName("6자리가 넘는 자동차 이름 입력시 IllegalArgumentException Exception 발생 Test")
    void checkValidStringLengthErrorTest() {
        String CAR_NAME_ERROR = "abcdef";
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                Util.checkValidStringLength(CAR_NAME_ERROR));
    }

    @Test
    @DisplayName("입력받은 자동차 이름이 한개일 경우 IllegalArgumentException Exception 발생 Test")
    void checkCarsNumTest() {
        String[] carsNameArray = "aa".split(",");
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                Util.checkCarsNum(carsNameArray));
    }

    @Test
    @DisplayName("입력받은 시도회수가 1보다 작은경우 IllegalArgumentException Exception 발생 Test")
    void checkPlayNumTest() {
        int minusInt = 0;
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                Util.checkPlayNum(minusInt));
    }


}
