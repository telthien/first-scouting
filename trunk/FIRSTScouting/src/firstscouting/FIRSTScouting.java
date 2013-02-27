package firstscouting;

import java.util.Scanner;
import javax.swing.UIManager;
import tournament.Match;
import tournament.MatchList;
import tournament.TeamList;

public class FIRSTScouting {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        FIRSTScoutingDisp display = new FIRSTScoutingDisp();
        
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print("Team R1: "); int r1 = s.nextInt();
            System.out.print("Team R2: "); int b1 = s.nextInt();
            System.out.print("Team B1: "); int r2 = s.nextInt();
            System.out.print("Team B2: "); int b2 = s.nextInt();
            System.out.print("Score R: "); int rS = s.nextInt();
            System.out.print("Score B: "); int bS = s.nextInt();
            MatchList.addMatch(new Match(r1, r2, b1, b2, rS, bS));
            MatchList.printMatchData();
            TeamList.printTeamData();
            System.out.println("");
        }
    }
}
