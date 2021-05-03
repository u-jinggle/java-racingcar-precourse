import java.util.Scanner;

class ScanCarNames {
    private ScanCarNames(){}

    public static String[] scan() {
        Scanner scanCarsName = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carsName = scanCarsName.next();
        return checkCarsNum(getCarNameArray(carsName));
    }

    private static String[] getCarNameArray(String carsName) {
        String[] carNameArray = Util.stringToArray(carsName);

        try {
            for (String carName : carNameArray) {
                Util.checkValidStringLength(carName);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return scan();
        }

        return carNameArray;
    }

    private static String[] checkCarsNum(String[] carNameArray) {
        try {
            Util.checkCarsNum(carNameArray);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return scan();
        }
        return carNameArray;
    }
}
