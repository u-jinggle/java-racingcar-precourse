import java.util.Scanner;

class ScanPlayNum {
    private ScanPlayNum(){}

    public static Integer scan() {
        Scanner scanCount = new Scanner(System.in);
        System.out.println("시도할 회수는 몇번인가요?");
        return checkPlayNum(scanCount.nextInt());
    }

    private static Integer checkPlayNum(Integer playNum) {
        try {
            Util.checkPlayNum(playNum);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return scan();
        }
        return playNum;
    }
}
