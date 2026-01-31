import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;
        System.out.println("Welecome to Weight Converter");
        System.out.println("1.Convert lbs to weight");
        System.out.println("2.Convert weight to lbs");
        System.out.print("Select an option: ");
        choice = sc.nextInt();
        if(choice==1){
            System.out.print("Enter the weight in lbs: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The weight in kgs is %.2fkgs.", newWeight);
        }
        else if(choice==2){
            System.out.print("Enter the weight in kgs: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The weight in lbs is %.2flbs.", newWeight);
        }
        else{
            System.out.print("Invalid choice.");
        }
        sc.close();
    }
}
