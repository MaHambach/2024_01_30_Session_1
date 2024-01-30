public class Person {
    // Properties
    String name;
    int age;
    String gender;

    // Constructors
    public Person(){}

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    // Method
    public void introduction(){
        String intro = "";
        intro += "Hello.";
        if(this.name != null) intro+=" My name is "+this.name+".";
        if(this.age > 0) intro+=" I am "+this.age+" years old.";
        if(this.gender != null) intro+=" I am "+this.gender+".";
        if(this.name == null && this.age==0 && this.gender == null) intro = "Hello. Please go away.";
/*
        if(this.name != null){
            if(this.age > 0){
                if(this.gender != null) intro = "Hello. I am "+this.name+", "+this.age+" years old and "+this.gender+".";
                else;
            }
            else{
                if(this.gender != null);
                else;
            }
        }
        else{
            if(this.age > 0){
                if(this.gender != null);
                else;
            }
            else{
                if(this.gender != null);
                else;
            }
        }*/
        System.out.println(intro);

    }
}
