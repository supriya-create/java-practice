public class GetterSetter {
    public static void main(String[] args) {
        Jewel jewel = new Jewel("Ring", "Gold", 30000);

        jewel.setMetal("Diamond");  //setter - write/change value
        jewel.setPrice(50000);

        System.out.println(jewel.getMetal()+" "+jewel.getName()+" "+jewel.getPrice()); //getter- print private value 
    }
}
