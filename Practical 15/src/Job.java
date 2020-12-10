public class Job implements Comparable<Job>{

    private String description;
    private int priority;
    private boolean completed;

    public Job(String description, int priority){
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void markCompleted(){
        this.completed = true;
    }

    public void printJobs () {
        final String formatString = "%-11s %4d %6b";
        System.out.println (String.format (formatString, this.description,
                this.priority,
                this.completed));
    }

    @Override
    public String toString() {
        return description;
    }

    @Override
    public int compareTo(Job job) {
        if (job.priority > this.priority) {
            return 1;
        } else {
            return -1;
        }
    }
}
