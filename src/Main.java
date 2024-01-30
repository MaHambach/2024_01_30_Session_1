public class Main {
    public static void main(String[] args) {
        /*Car car=new Car();
        car.start();
        Car car2 = new Car("Honda", "Civic", "magenta", 2005);
        car2.start();
        Car car3 = new Car("Audi", "A12", "black", 2015, 120);
        car3.start();
        car2.acellerate(10);
        car3.acellerate(-120);
        car2.start();
        car3.start();*/

        Person bob = new Person();
        bob.introduction();

        Person person1 = new Person("Hans", "male");
        person1.introduction();

        Person person2 = new Person("Nick", 54, "non-binary");
        person2.introduction();

        Person person3 = new Person("Olga", 31, "female");
        person3.introduction();

        Person person4 = new Person("Rael", "female");
        person4.introduction();

    }
}