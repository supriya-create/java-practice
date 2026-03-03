// import java.util.*;
// public class IncrementalCounterNC {
//     private int count = 0;

//     void increment() {
//         this.count++;   // using 'this'
//     }

//     int getCount() {
//         return this.count;   // using 'this'
//     }
// }
// class MainApp {
//     public static void main(String[] args) {
//         IncrementalCounterNC counter = new IncrementalCounterNC();
//         Scanner scanner = new Scanner(System.in);

//         int numIncrements = scanner.nextInt();

//         for (int i = 0; i < numIncrements; i++) {
//             counter.increment();
//         }

//         System.out.println("Final Count: " + counter.getCount());
//         scanner.close();
//     }
// }


//////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Account{
    int accountNumber;
    int balance;
    Account(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
class SavingsAccount extends Account{
    int interestRate;
    SavingsAccount(int interestRate, int accountNumber, int balance){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
}
public class IncrementalCounterNC{
    public static void main(String[] args){
        SavingsAccount acc1 = new SavingsAccount(13, 1234, 12000);
        System.out.println("accountNumber is: " + acc1.accountNumber);
        System.out.println("balance is : " + acc1.balance);
    }
}