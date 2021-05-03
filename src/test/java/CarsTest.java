import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CarsTest {
    private Car car1;
    private Car car2;
    private Car car3;

    @BeforeEach
    void setUp() {
        String NAME1 = "test1";
        String NAME2 = "test2";
        String NAME3 = "test3";
        car1 = new Car(NAME1);
        car2 = new Car(NAME2);
        car3 = new Car(NAME3);
    }

    @Test
    @DisplayName("Cars객체가 구성된 Car객체와 같은지 비교 Test")
    void getCarsTest() {
        List<Car> carList = Arrays.asList(
                car1, car2, car3
        );
        Cars cars = new Cars(carList);
        int i = 0;
        for (Car car : cars.getCars()) {
            assertThat(car).isEqualTo(carList.get(i++));
        }
    }

    @Test
    @DisplayName("Cars를 시도회수만큼 반복해 play했을때의 결과값 확인 Test")
    void playTest() {
        List<Car> carList = Arrays.asList(
                car1, car2, car3
        );
        Cars cars = new Cars(carList);
        int playCount = 4;

        cars.play(playCount);
    }

    @Test
    void getWinnerTest() {
        int car1Move = 4;
        int car2Move = 5;
        int car3Move = 5;

        for (int i = 0; i < car1Move; i++) {
            car1.moveForward(9);
        }
        for (int i = 0; i < car2Move; i++) {
            car2.moveForward(9);
        }
        for (int i = 0; i < car3Move; i++) {
            car3.moveForward(9);
        }
        List<Car> carList = Arrays.asList(
                car1, car2, car3
        );
        Cars cars = new Cars(carList);

        String expectResult = "test2, test3가 최종 우승했습니다.";
        assertThat(cars.getWinner()).isEqualTo(expectResult);
    }
}
