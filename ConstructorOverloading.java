public class ConstructorOverloading {
    ConstructorOverloading(){
        System.out.println("Default constructor");
    }
    ConstructorOverloading(int x){
        System.out.println("Parametrized constructor: "+x);
    }
    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading();
        ConstructorOverloading c2 = new ConstructorOverloading(10);
    }
}
