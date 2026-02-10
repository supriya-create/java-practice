import java.util.Scanner;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pet pet;

        System.out.print("Would you like a panda or parrot? (1 = panda, 2 = parrot): ");
        int choice = sc.nextInt();

        if(choice==1){
            pet = new Panda();
            pet.myPet();
        }
        else{
            pet = new Parrot();
            pet.myPet();
        }
        sc.close();
    }
}
