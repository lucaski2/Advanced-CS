public class Task{
    private String name;
    private int rank;

    public Task(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o){
        Task t = (Task) o;
        if (this.name.equals(t.name) && this.rank == t.rank){
            return true;
        }
        return false;
    }
    public int getRank(){
        return rank;
    }
}