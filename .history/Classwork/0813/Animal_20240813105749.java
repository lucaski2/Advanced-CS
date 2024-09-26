public class Animal{
    private String type;
    private String name;
    private int age;

    public Animal(String type, String name, int age) {
        this.age = age;
        this.type = type;
        this.name = name;
    }

    public String toString(){
        return "The animal's type is " + type + ". The animal's name is " + name + ". The animal's age is " + age + ".";
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}