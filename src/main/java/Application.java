import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanCarsName = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carsName = scanCarsName.next();

        Scanner scanCount = new Scanner(System.in);
        System.out.println("시도할 회수는 몇번인가요?");
        Integer count = scanCount.nextInt();
    }
}
