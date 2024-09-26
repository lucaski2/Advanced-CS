public class Bird extends Animal
{
    private String color;
    public Bird(String name, String color)
    {
        super(name);
        this.color = color;
    }
    public String speak()
    {
        return "Chirp";
    }
    public String getColor()
    {
        return color;
    }
}