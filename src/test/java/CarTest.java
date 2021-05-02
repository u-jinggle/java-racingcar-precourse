import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    private String carName;
    private Car car;

    @BeforeEach
    void setUp(){
        carName = "test";
        car = new Car(carName);
    }

    @Test
    @DisplayName("이름을 입력받아 Car 객체 생성 후, name과 position get Test")
    void getCarTest() {
        assertThat(carName).isEqualTo(car.getName());
        assertThat(car.getPosition()).isZero();
    }

    @Test
    @DisplayName("입력받은 randomInt값이 4이상일 경우 position값 +1 Test")
    void moveForwardTest() {
        int beforeMovePosition = car.getPosition();
        car.moveForward(4);
        assertThat(car.getPosition()).isEqualTo(beforeMovePosition+1);
    }

    @Test
    @DisplayName("입력받은 randomInt값이 4보다 작을 경우 position값 그대로 인지 Test")
    void noMoveForwardTest(){
        int beforeMovePosition = car.getPosition();
        car.moveForward(3);
        assertThat(car.getPosition()).isEqualTo(beforeMovePosition);
    }

}