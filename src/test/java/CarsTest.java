import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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
}
