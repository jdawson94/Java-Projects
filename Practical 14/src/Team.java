public class Team implements Comparable<Team> {

    private String name;
    private int played;
    private int won;
    private int drawn;
    private int lost;
    private int ptsFor;
    private int ptsAg;
    private int ptsDif;
    private int points;

    public Team (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playMatch (int homePts, int awayPts){
        this.played += 1;
        this.ptsFor += homePts;
        this.ptsAg += awayPts;
        this.ptsDif = this.ptsFor - ptsAg;
        if (homePts > awayPts) {
            this.won += 1;
            this.points += 2;
        }
        else if (homePts == awayPts) {
            this.drawn += 1;
            this.points += 1;
        }
        else {
            this.lost += 1;
        }
    }

    @Override
    public String toString() {
        final String formatString = "%-13s %3s %3s %3s %3s %3s %3s %3s %3s";
        return (String.format(formatString, this.name, this.played, this.won, this.drawn, this.lost,
                this.ptsFor, this.ptsAg, this.ptsDif, this.points));
    }

    @Override
    public int compareTo(Team team) {
        if (team.points > this.points) {
            return 1;
        }
        else if (team.points < this.points) {
                return -1;
            }
        else if (team.ptsDif > this.ptsDif){
                return 1;
            }
            else{
                return -1;
            }
        }
    }

