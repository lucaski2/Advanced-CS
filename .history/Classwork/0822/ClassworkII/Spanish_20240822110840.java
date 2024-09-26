public class Spanish implements Language{
    
    public String getLanguage(){
        return "Spanish";
    }
    public String getAuthor(){
        return super.author;
    }
    public String getHello(){
        return "Hola";
    }
    public String getBye(){
        return "Adiós";
    }
}