import java.io.File;
import java.util.Scanner;

public class DayTwo {
    int scoreTotal = 0;
    public static void main(String[] args) {
        DayTwo dayTwo = new DayTwo();
        try {
            File file = new File("P:\\Coding\\Java\\AOC2022\\Day2\\input");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String nextLine = sc.nextLine();
                char[] roundChoices = nextLine.toCharArray();
                dayTwo.scoreTotal += dayTwo.rateRound(roundChoices[2], dayTwo.determineWinner(roundChoices[2], roundChoices[0]));
                System.out.println(Integer.toString(dayTwo.scoreTotal));
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public char determineWinner(char playerChoice, char opponentChoice) {
        // A and X is Rock
        // B and Y is Paper
        // C and Z is Scissors
        char roundOutcome = 'e';

        switch(playerChoice) {
            case 'X':
                if (opponentChoice == 'A') {
                    roundOutcome = 'D';
                } else if (opponentChoice == 'B') {
                    roundOutcome = 'L';
                } else {
                    roundOutcome = 'W';
                }
                break;
            case 'Y':
                if (opponentChoice == 'A') {
                    roundOutcome = 'W';
                } else if (opponentChoice == 'B') {
                    roundOutcome = 'D';
                } else {
                    roundOutcome = 'L';
                }
                break;
            case 'Z':
                if (opponentChoice == 'A') {
                    roundOutcome = 'L';
                } else if (opponentChoice == 'B') {
                    roundOutcome = 'W';
                } else {
                    roundOutcome = 'D';
                }
                break;
        }
        return roundOutcome;
    }

    public int rateRound(char playerChoice, char roundOutcome) {
        // A and X is Rock
        // B and Y is Paper
        // C and Z is Scissors
        int score = 0;
        switch(playerChoice) {
            case 'X':
                score += 1;
                break;
            case 'Y':
                score += 2;
                break;
            case 'Z':
                score += 3;
                break;
        }

        switch(roundOutcome) {
            case 'W':
                score += 6;
                break;
            case 'D':
                score += 3;
                break;
            case 'L':
                break;
        }

        return score;
    }
}
