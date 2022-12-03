import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class DayOne {
    public static void main(String[] args) {
        int elfIndex = 0;
        ArrayList<Integer> elfArrayList = new ArrayList<Integer>();
        int fattestElf = 0;
        elfArrayList.add(0);

        try {
            File file = new File("P:\\Coding\\Java\\AOC2022\\Day1\\input");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String nextLine = sc.nextLine();
                if (nextLine.length() > 0) {
                    elfArrayList.set(elfIndex, elfArrayList.get(elfIndex) + Integer.parseInt(nextLine));
                } else {
                    elfIndex++;
                    elfArrayList.add(0);
                }
            }
            sc.close();

            for (int i = 0; i < elfArrayList.size(); i++) {
                System.out.println("Elf " + Integer.toString(i) + " has " + Integer.toString(elfArrayList.get(i)) + " calories.");
                if (fattestElf < elfArrayList.get(i)) {
                    fattestElf = elfArrayList.get(i);
                }
            }
    
            System.out.println("The elf with the most calories has " + Integer.toString(fattestElf) + " calories.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
