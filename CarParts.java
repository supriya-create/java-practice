public class CarParts{
    String model;
    int year;
    Engine engine;

    CarParts(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }
    void start(){
        engine.start();
    }
}
