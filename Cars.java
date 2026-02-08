public class Cars {
    String name;
    String model;
    String color;
    int year;

    Cars(String name, String model, String color,int year){
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString(){
        return this.color+" "+this.year+" "+this.name+" "+this.model;
    }
}
