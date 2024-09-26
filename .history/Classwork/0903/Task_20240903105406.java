public class Task{
    private String name;
    private int rank;

    public Task(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o){
        //cast o to the Task type
    //return true if the contents of the other task is the same
    //and false otherwise
        Task t = (Task) o;
        if (this.name.equals(t.name) && this.rank == t.rank){
            return true;
        }
        return false;
    }
}