import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RandomNumTest {
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 9;

    @Test
    @DisplayName("0부터 9사이의 random Int 생성 Test")
    void randomNumTest() {
        for (int i = 0; i < 100; i++) {
            RandomNum randomNum = new RandomNum();
            assertThat(randomNum.getNum()).isBetween(RANDOM_MIN, RANDOM_MAX);
        }
    }
}