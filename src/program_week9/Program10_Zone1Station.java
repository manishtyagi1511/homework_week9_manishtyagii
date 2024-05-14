package program_week9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program10_Zone1Station {

    /**
     *Write a programme that tells you which line passes through particular stations.
     * Just use Zone 1 stations name
     *
     */


    public static void main(String[] args) {
        // Create a map to store station names and corresponding lines
        Map<String, String[]> stationLines = new HashMap<>();
        stationLines.put("Waterloo", new String[]{"Bakerloo", "Jubilee", "Northern", "Waterloo & City"});
        stationLines.put("Bank", new String[]{"Central", "Northern", "Waterloo & City"});
        stationLines.put("Liverpool Street", new String[]{"Central", "Circle", "Hammersmith & City", "Metropolitan"});
        stationLines.put("King's Cross St. Pancras", new String[]{"Circle", "Hammersmith & City", "Metropolitan", "Northern", "Piccadilly", "Victoria"});
        stationLines.put("Baker Street", new String[]{"Bakerloo", "Circle", "Hammersmith & City", "Jubilee", "Metropolitan"});
        // Add more stations and lines as needed

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Zone 1 station name: ");
        String stationName = scanner.nextLine();

        if (stationLines.containsKey(stationName)) {
            System.out.println("Lines passing through " + stationName + ":");
            String[] lines = stationLines.get(stationName);
            for (String line : lines) {
                System.out.println("- " + line);
            }
        } else {
            System.out.println("Station not found or not in Zone 1.");
        }

        scanner.close();
    }
}
