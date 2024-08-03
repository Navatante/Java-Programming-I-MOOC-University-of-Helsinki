import java.util.ArrayList;

public class Matches {
    private String homeName, visitingName;
    private int homePoints, visitingPoints;

    public Matches() {
        // Empty constructor
    }

    public Matches(String homeName, String visitingName, int homePoints, int visitingPoints) {
        this.homeName = homeName;
        this.visitingName = visitingName;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }

    public int gamesPlayed(String team, ArrayList<Matches> list) {
        int count = 0;
        for (Matches match : list) {
            if (match.homeName.equals(team) || match.visitingName.equals(team)) {
                count++;
            }
        }
        return count;
    }
    
    public int wins(String team, ArrayList<Matches> list) {
        int count = 0;
        for (Matches match : list) {
            if ((match.homeName.equals(team) && match.homePoints > match.visitingPoints) ||
                    (match.visitingName.equals(team) && match.visitingPoints > match.homePoints)) {
                count++;
            }
        }
        return count;
    }

    public int losses(String team, ArrayList<Matches> list) {
        int count = 0;
        for (Matches match : list) {
            if ((match.homeName.equals(team) && match.homePoints < match.visitingPoints) ||
                    (match.visitingName.equals(team) && match.visitingPoints < match.homePoints)) {
                count++;
            }
        }
        return count;
    }
}