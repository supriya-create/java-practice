public class Laptop {
    String brand;
    int ram;
    void setData(String b, int r) {
        brand = b;
        ram = r;
    }
     void display() {
        System.out.println(brand + " " + ram + "GB");
    }
    public static void main(String[] args){
        
    }
}
