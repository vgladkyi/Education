package JavaCourse.SecondLesson;


public class Car {

    private int speed;
    private String model;
    private float weight;
    private String color;
    private boolean isWork;

    Car(int speed,String model,float weight,String color,boolean isWork){
        this.speed = speed;
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.isWork = isWork;
        printAll();
    }

    Car(){
        System.out.println("Object has been created");
    }

    void setAll(int speed,String model,float weight,String color,boolean isWork){
            this.speed = speed;
            this.model = model;
            this.weight = weight;
            this.color = color;
            this.isWork = isWork;
    }
    void printAll(){
        String isWork = this.isWork ? "na hodu)":"slomana(";
        System.out.println("Moya mashina eto "+this.model+" imeet max skorost "+this.speed+" vesom "+this.weight+"kg. Ee cvet "+this.color+" i ona "+ isWork);
    }
}
