public class Students extends Person{
    int gpa;
    Students(String first, String last, int gpa){
        super(first,last);
        this.gpa = gpa;
    }

    void showgpa(){
        System.out.println(this.first+"'s"+" gpa is "+this.gpa);
    }
}
