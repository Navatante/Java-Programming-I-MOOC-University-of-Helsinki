import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Matches> list = new ArrayList<>();

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        try (Scanner scFile = new Scanner(Paths.get(file))) {
            while (scFile.hasNextLine()) {
                String row = scFile.nextLine();
                String[] parts = row.split(",");
                String homeTeam = parts[0].trim();
                String visitingTeam = parts[1].trim();
                int homePoints = Integer.parseInt(parts[2].trim());
                int visitingPoints = Integer.parseInt(parts[3].trim());
                list.add(new Matches(homeTeam, visitingTeam, homePoints, visitingPoints));
            }

            Matches games = new Matches();
            int wins = games.wins(team, list);
            int losses = games.losses(team, list);

            System.out.println("Games: " + games.gamesPlayed(team, list));
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}