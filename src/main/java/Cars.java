import java.util.*;

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

    public String getWinner() {
        Map<Integer, String> winner = new HashMap<>();

        for (Car car : cars) {
            mapPlayResult(winner, car);
        }
        Integer maxPosition = Collections.max(winner.keySet());
        return winner.get(maxPosition) + "가 최종 우승했습니다.";
    }

    private void mapPlayResult(Map<Integer, String> winner, Car car) {
        winner.computeIfPresent(car.getPosition(), (position, name) -> winner.get(position).concat(", ").concat(car.getName()));
        winner.computeIfAbsent(car.getPosition(), key -> car.getName());
    }
}
