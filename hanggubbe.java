//liv: 5
//input: X
//ordet: .ete.
//använda ored: bwp
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class hanggubbe {
    public static void main(String[] args) {
        System.out.println(start);
        try {
            File ord = new File("filena");
            Scanner fil = new Scanner(ord);
            String word = fil.nextLine();
            System.out.println(word);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        string ordet = fil.nextLine();
        char[] antalbokstäver = new char[ordet.length()];
        for (int i = 0; i < ordet.length(); i++) {
            ordet[i] = "_"
        }

        int liv = 5;
        while (liv > 0) {
            System.out.println(liv:);
            for (int i = 0; i < liv.length(); i++) {
                System.out.println(O);

            }

            char ordet = input.charAt(0);
            System.out.println("bokstaven:");
            for (int i = 0; i < ordet.length(); i++) {
                System.out.print(ordet[i]);
            }
            boolean gissningen = false
            for (int i = 0; i < bokstav.length(); i++) {
        char c = bokstav.charAt(i);
        if (c == ordet){
            ordet[i] = c;
            gissningen = true}            