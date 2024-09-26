
public abstract class Animal
{
    private String name;

    public Animal(String name)
    {
        this.name = name;
    }
    public abstract String speak();
    public abstract String getColor();
    public String getName()
    {
        return name;
    }
    public void printInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Color: " + getColor());
        System.out.println("Sound: " + speak());
    }
}