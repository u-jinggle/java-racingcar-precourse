import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void play(int playCount) {
        for (int count = 0; count < playCount; count++) {
            playCar();
            System.out.println();
        }
    }

    private void playCar() {
        for (Car car : cars) {
            RandomNum randomNum = new RandomNum();
            car.moveForward(randomNum.getNum());
            System.out.println(car.playResult());
        }
    }
}
