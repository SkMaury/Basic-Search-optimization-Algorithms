package StochasticSearch;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StochasticSearch {

    private Random random = new Random();
    private static final double START_X = -2;
    private static final double END_X = 2;

    private double f(double x){
        return (x + 1) * (x + 1) - 3;
    }

    public void stochasticSearch() {
        double startPointX = START_X;
        double min = f(startPointX);
        double minX = START_X;
        for (int i = 0; i < 10000000; i++){
            double randomX = ThreadLocalRandom.current().nextDouble(START_X, END_X);
            if(f(randomX) < min) {
                min = f(randomX);
                minX = randomX;
            }
        }
        System.out.println("The minimum of f(x) = " + min + " and the X point is " + minX);
    }
}
