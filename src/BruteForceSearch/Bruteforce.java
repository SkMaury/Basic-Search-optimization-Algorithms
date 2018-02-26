package BruteForceSearch;

public class Bruteforce {

    //These variables define interval [START_X, END_X].
    private static final double START_X = -1;
    private static final double END_X = 2;

    private double f(double x){
        return (x - 1) * (x - 1);
    }
    void bruteForceSearch(){
        double startingPointX = START_X;
        //double max = f(startingPointX);
        double min = f(startingPointX);
        double dx = 0.001;
        //double maxX = START_X;
        double minX = START_X;
        for (double i = startingPointX; i < END_X; i += dx){
            if (f(i) < min) {
                min = f(i);
                minX = i;
            }
        }
        System.out.println("Minimum value is f(x) = " + min + " and x = " + minX);
    }
}
