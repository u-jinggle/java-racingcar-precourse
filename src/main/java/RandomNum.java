import java.util.Random;

public class RandomNum {
    private static Random random = new Random();
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 9;
    private int num;

    public RandomNum(){
        this.num = random.nextInt(RANDOM_MIN+RANDOM_MAX+1) + RANDOM_MIN;
    }

    public int getNum() {
        return num;
    }
}
