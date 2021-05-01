import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class UtilTest {

    @Test
    @DisplayName("6자리가 넘는 자동차 이름 입력시 IllegalArgumentException Exception 발생 Test")
    void checkValidStringLengthErrorTest() {
        String CAR_NAME_ERROR = "abcdef";
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                Util.checkValidStringLength(CAR_NAME_ERROR));
    }
}
