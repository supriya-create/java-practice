public class OOPsdemo {
    String name;
    int rollno;
    OOPsdemo(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    void display(){
        System.out.println("Name: "+this.name+" Roll no: "+this.rollno);
    }
    public static void main(String[] args) {
        OOPsdemo student = new OOPsdemo("Supriya", 7);
        student.display();
    }
}
