public class Japanese implements Language{
    
    public String getLanguage(){
        return "Japanese";
    }
    public String getAuthor(){
        return super.author;
    }
    public String getHello(){
        return "こんにちは";
    }
    public String getBye(){
        return "さようなら";
    }
}