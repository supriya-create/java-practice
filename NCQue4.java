import java.util.Scanner;
import java.util.Scanner;

class GrowthLogger {

    double initialHeight;

    // Constructor
    GrowthLogger(double initialHeight) {
        this.initialHeight = initialHeight;
    }

    // Non-static inner class
    class PlantGrowth {
        double height;

        PlantGrowth(double height) {
            this.height = height;
        }

        double[] calculate(int days, double growth) {
            double[] result = new double[days];

            for (int i = 0; i < days; i++) {
                height += growth;
                result[i] = height;
            }

            return result;
        }
    }

    // Method used by footer
    public double[] startMonitoring(int days, double dailyGrowth) {
        PlantGrowth plant = new PlantGrowth(initialHeight);
        return plant.calculate(days, dailyGrowth);
    }
}
public class NCQue4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double initialHeight = sc.nextDouble();
        double dailyGrowth = sc.nextDouble();
        int days = sc.nextInt();

        GrowthLogger growthLogger = new GrowthLogger(initialHeight);
        double[] growthLogs = growthLogger.startMonitoring(days, dailyGrowth);

        for (int i = 0; i < days; i++) {
            System.out.println("Day " + (i + 1) + ": " + String.format("%.2f", growthLogs[i]) + " inches");
        }

        sc.close();
    }
}
