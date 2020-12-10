import java.util.ArrayList;
import java.util.Collections;

public class Diary {

    private ArrayList<Job> jobs;

    public Diary(){
        this.jobs = new ArrayList<>();
    }

    public void addJob(Job newJob){
        this.jobs.add(newJob);
    }

    public void searchDiary(String search){
        System.out.println("Jobs found containing " + search);
        for (Job j : jobs){
            if (j.getDescription().contains(search)){
                System.out.println(j);
            }
        }
        System.out.println();
    }

    public void sortDiary(){
        Collections.sort(jobs);
    }

    public void purgeDiary(){
        jobs.removeIf(Job::isCompleted);
    }

    public void printDiary () {
        if (this.jobs.isEmpty ()) {
            System.out.println ("No jobs to do");
        }
        else {
            System.out.println("Job Diary\n");
            for (Job j : jobs) {
                j.printJobs ();
            }
            System.out.println();
        }
    }

}
