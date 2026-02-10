public class Jewel {

    private final String name;      //can't change
    private String metal;
    private int price;
    
    Jewel(String name,String metal,int price){
        this.name = name;
        this.metal = metal;
        this.price = price;
    }

    String getName(){
        return this.name;
    }
    String getMetal() {
        return this.metal;
    }
    String getPrice(){
        return "Rs." + this.price;
    }

    void setMetal(String metal){
        this.metal = metal;
    }
    void setPrice(int price){
        if(price<0){
            System.out.println("Price can't be less than 0.");
        }
        else{
            this.price=price;
        }
    }
}
