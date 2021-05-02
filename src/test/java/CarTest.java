import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    @Test
    @DisplayName("이름을 입력받아 Car 객체 생성 후, name과 position get Test")
    void getCarTest() {
        String carName = "test";
        Car car = new Car(carName);
        assertThat(carName).isEqualTo(car.getName());
        assertThat(car.getPosition()).isZero();
    }
}