import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        String[] carNameArray = ScanCarNames.scan();
        Integer playCount = ScanPlayNum.scan();

        List<Car> carList = new ArrayList<>();
        for (String carName : carNameArray) {
            carList.add(new Car(carName));
        }

        Cars cars = new Cars(carList);
        cars.play(playCount);
        String winner = cars.getWinner();

        System.out.println(winner);
    }
}
