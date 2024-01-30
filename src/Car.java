public class Car {
    // Properties
    String brand;
    String model;
    String color;
    int year_of_manufacture;

    int speed;

    // Constructors
    public Car(){
    }

    public Car(String brand, String model, String color, int year_of_manufacture){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.year_of_manufacture=year_of_manufacture;
        this.speed = 0;
    }

    public Car(String brand, String model, String color, int year_of_manufacture, int speed){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.year_of_manufacture=year_of_manufacture;
        this.speed = speed;
    }

    // Methods
    public void start(){
        String print = "";
        print += "The";
        if(this.color!=null) print+= " "+this.color;
        if(this.year_of_manufacture>0) print+=" "+this.year_of_manufacture;
        if(this.brand !=null) print+=" "+this.brand;
        if(this.model==null) print+=" car";
        else print +=" "+this.model;
        print += " is running";
        if(speed>0) print+=" and is going "+this.speed+" miles per hour.";
        else print+= ".";
        System.out.println(print);
    }

    public void accelerates(int changeOfSpeed){
        this.speed += changeOfSpeed;
    }
}
