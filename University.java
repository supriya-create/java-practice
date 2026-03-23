abstract class Uni{
    abstract void courses();
    abstract void admission();
}
class EngClg extends Uni{
    void courses(){
        System.out.println("BTECH CSE");
        System.out.println("BTECH AI/ML");
        System.out.println("BTECH AERONAUTICS");
        System.out.println("BTECH CIVIL");
        System.out.println("BTECH MECHANICAL");
    }
    void admission(){
        System.out.println("Admission: OPEN!");
    }
}
class MedClg extends Uni{
    void courses(){
        System.out.println("MBBS");
        System.out.println("PHARMACY");
        System.out.println("HOMEOPATHY");
        System.out.println("NATUROPATHY");
    }
    void admission(){
        System.out.println("Admissions: CLOSED!");
    }
}
public class University {
    public static void main(String[] args) {
        Uni u1 = new EngClg();
        Uni u2 = new MedClg();
        u1.courses();
        u1.admission();
        u2.courses();
        u2.admission();
    }
}
