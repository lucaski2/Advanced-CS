
public class Item
{
    private int price;
    private String name;
    private int quantity;

    public Item(int price, String name, int quantity)
    {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    public int hashCode()
    {
        char first_letter = name.charAt(0);
        int b = first_letter - 'a';
        int c = price;
        return price * 29 + b;
    }

    public String toString(){
        return name + " " + price * quantity + " " + quantity;
    }
    public char getLetter(){
        return name.charAt(0);
    }

    public int getPrice(){
        return price;
    }

    public boolean equals(Item item){
        if(this.getLetter() == item.getLetter() && price == item.getPrice()){
            return true;
        }
        return false;
    }   

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}