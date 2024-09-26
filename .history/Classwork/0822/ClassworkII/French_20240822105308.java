public class French implements Language{
    
    public String getLanguage(){
        return "French";
    }
    public String getAuthor(){
        return super.author;
    }
    public String getHello(){
        return "Bonjour";
    }
    public String getBye(){
        return "Au revoir";
    }

}