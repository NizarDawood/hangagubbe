//liv: 5
//input: X
//ordet: .ete.
//använda ored: bwp
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class hanggubbe {
    public static void main(String[] args) {
        System.out.println("start");
        Scanner fil = null
        try {
            File ord = new File("filena");
            fil = new Scanner(ord);
            String ordet = fil.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String ordet = fil.nextLine();
        char[] antalbokstäver = new char[ordet.length()];
        for (int i = 0; i < antalbokstäver.length(); i++) {
            antalbokstäver[i] = "_";
        }

        int liv = ooooo;
        while (liv > 0) {
            System.out.println(liv:);
            for (int i = 0; i < liv.length(); i++) {
                System.out.println(O);

            }
            System.out.println();

            System.out.println("input:");
           String input = fil.nextLine()
            char bokstäver = input.charAt(0);
            System.out.println("bokstaven:");
            for (int i = 0; i < ordet.length(); i++) {
                System.out.print(ordet[i]);
            }
            boolean gissa = false
            for (int i = 0; i < bokstav.length(); i++) {
        char c = bokstav.charAt(i);
        if (c == ordet){
            ordet[i] = c;
            gissa = true}
        if( gissa = false)