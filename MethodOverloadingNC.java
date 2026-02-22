// Sharon, a software developer, is working on a project to automate velocity calculations for various objects. She wants to create a class named VelocityCalculator with overloaded methods calculateVelocity to calculate the velocity. One method will accept distance in meters and time in seconds as integers, while another will accept distance and time as doubles.



// Help her in completing the project.



// Formula: Velocity = distance / time
import java.util.Scanner;
class VelocityCalculator {
      public static int calculateVelocity(int distance, int time){
          return distance/time;
      }
      public static double calculateVelocity(double distance, double time){
          return distance/time;
      }
}
public class MethodOverloadingNC {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the inputs: ");
        int distanceInt = scanner.nextInt();
        int timeInt = scanner.nextInt();
        
        double distanceDouble = scanner.nextDouble();
        double timeDouble = scanner.nextDouble();
        int velocityInt = VelocityCalculator.calculateVelocity(distanceInt, timeInt);
        double velocityDouble = VelocityCalculator.calculateVelocity(distanceDouble, timeDouble);
        
        System.out.println("Velocity with integer inputs: " + velocityInt + " m/s");
        System.out.printf("Velocity with double inputs: %.2f m/s", velocityDouble);
        scanner.close();
    }

}
