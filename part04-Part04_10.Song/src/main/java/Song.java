public class Song {
    private String name;
    private Integer seconds;

    public Song(String name, int length) {
        this.name = name;
        seconds = length;
    

    }
    public String name() {
        return name;
    }
    public int length() {
        return seconds;
    }




    
}
