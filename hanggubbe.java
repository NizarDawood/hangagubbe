import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class hanggubbe {
    public static void main(String[] args) {
            File ord = new File("filena");
            Scanner fil = new Scanner(ord);
            String gissa = JOptionPane.showInputDialog("gissa på en bokstav");



            string text = fil.nextLine();

            String ord = "";
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c == gissa)
                    ord += c;)
            }
        }
        System.out.println(ord);

    }
}
