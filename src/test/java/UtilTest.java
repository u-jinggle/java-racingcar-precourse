import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UtilTest {
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 9;

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
    @DisplayName("0부터 9사이의 random Int 생성 Test")
    void createRandomIntTest() {
        for (int i = 0; i < 100; i++) {
            assertThat(Util.createRandomInt()).isBetween(RANDOM_MIN, RANDOM_MAX);
        }
    }
}
