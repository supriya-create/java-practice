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
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();

        l1.setData("HP", 8);
        l2.setData("Dell", 16);
    }
}
