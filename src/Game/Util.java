package Game;

import java.util.Random;

/**
 * Created by Black  on 05/07/16.
 */
public class Util {
    private static Random random = new Random();

    private Util() {}


    public static int randomInt(int lowerLimit, int upperLimit) {
        return Util.random.nextInt(upperLimit - lowerLimit) + lowerLimit;
    }

}
