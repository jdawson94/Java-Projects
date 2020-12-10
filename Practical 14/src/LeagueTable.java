public class LeagueTable {

    public static void main(String[] args) {
        Team hud = new Team("Huddersfield");
        Team hullFC = new Team("Hull FC");
        Team hullKR = new Team ("Hull KR");
        Team leeds = new Team("Leeds");
        Team stHelens = new Team ("St Helens");
        Team wigan = new Team("Wigan");

        League superLeague = new League();

        superLeague.addTeam(hud);
        superLeague.addTeam(hullFC);
        superLeague.addTeam(hullKR);
        superLeague.addTeam(leeds);
        superLeague.addTeam(stHelens);
        superLeague.addTeam(wigan);

        hud.playMatch(10,22);
        hullFC.playMatch(22,10);
        leeds.playMatch(12,12);
        wigan.playMatch(12,12);
        hullKR.playMatch(28,30);
        stHelens.playMatch(30,28);

        superLeague.sortLeague();

        System.out.println(superLeague);
    }
}
