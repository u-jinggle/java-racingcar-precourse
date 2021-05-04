import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void moveForward(int randomInt) {
        if (randomInt >= 4) {
            this.position++;
        }
    }

    public String playResult() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(" : ");
        for (int p = 0; p < position; p++) {
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }

    public static List<Car> makeCarList(String[] carNameArray) {
        List<Car> carList = new ArrayList<>();
        for (String carName : carNameArray) {
            carList.add(new Car(carName));
        }
        return carList;
    }
}
