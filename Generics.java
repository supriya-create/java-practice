public class Generics {
    public static void main(String[] args) {
        Products<String, Double> product1 = new Products<>("Apple", 10.5);
        Products<String, Integer> product2 = new Products<>("Tickets", 15);

        System.out.println(product1.getItem());
        System.out.println(product2.getPrice());
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
