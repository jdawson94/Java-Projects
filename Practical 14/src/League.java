import java.util.ArrayList;
import java.util.Collections;

public class League {

    private ArrayList <Team> teams;

    public League (){
        this.teams = new ArrayList<>();
    }

    public void addTeam (Team newTeam) {
        this.teams.add (newTeam);
    }

    public void sortLeague(){
        Collections.sort(this.teams);
    }

    public String toString () {
        String s = "";
        s = "League Table\n                P   W   D   L  PF  PA  PD   PTS\n";
        for (Team t: this.teams) {
            s += t.toString ();
            s += "\n";
        }
        return s;
    }

}
