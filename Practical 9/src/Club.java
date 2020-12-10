import java.util.ArrayList;

public class Club {

    private ArrayList <Member> members;

    public Club (){
        this.members = new ArrayList<Member>();
    }

    public Club (ArrayList <Member> members){
        this.members = members;
    }

    public void addMember (Member newMember) {
        this.members.add (newMember);
    }

    public int totalContribution(){
        int total = 0;
        for (Member m: this.members){
            total += m.getContribution();
        }
        return total;
    }

    public int totalTurkeys(int turkey) {
        int total = totalContribution();
        total /= turkey;
    return total;
    }

    public String toString () {
        String s = "";
        s = "Members\n\n";
        for (Member m: this.members) {
            s += m.toString ();
            s += "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        Member gary = new Member("Gary",27);
        Member tony = new Member("Tony",21);
        Member rubiya = new Member("Rubiya",20);
        Member steve = new Member("Steve",28);

        Club christmasClub = new Club();

        christmasClub.addMember(gary);
        christmasClub.addMember(tony);
        christmasClub.addMember(rubiya);
        christmasClub.addMember(steve);

        System.out.println(christmasClub);

        System.out.println(christmasClub.totalContribution());

        System.out.println(christmasClub.totalTurkeys(20));

    }
}
