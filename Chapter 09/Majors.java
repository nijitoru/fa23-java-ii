import java.util.Scanner;
import java.util.ArrayList;
public class Majors {

    enum Major {ACC, CHEM, CIS, ENG, HIS, PHYS};
    // business - acc, cis
    // science - chem, phys
    // humanities - eng, his

    public static void main(String[] args) {
        System.out.println("College majors: ");
        for (Major m : Major.values()) {
            System.out.println(m);
        }
        System.out.println();
        System.out.print("Select a major: ");
        Scanner input = new Scanner(System.in);
        String entry = input.next().toUpperCase();

        if(entry.equals("ACC") || entry.equals("CIS")){
            System.out.println("Business Division");
        } else if (entry.equals("CHEM") || entry.equals("PHYS")) {
            System.out.println("Science Division");
        } else if (entry.equals("ENG") || entry.equals("HIS")) {
            System.out.println("Humanities Division");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
