import java.util.Scanner;

/**
 * Recitation7 is a class for completing
 *  Reciation 7 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class Recitation7 {
    // define your constants after this comment
    public static void main(String[] args) {
        System.out.println(Recitation7.leftRightTriangle(4));
        System.out.println(Recitation7.rightRightTriangle(4));
        System.out.println(Recitation7.repeatString('*', 10));
    }

    private static String repeatString(char aChar, int numOfRepetition) {
        String str = "";
        for (int count = 0; count < numOfRepetition; count++) {
            str += aChar;
        }
        return str;
    }

    public static String leftRightTriangle(int height) {
        String str = "";
        //add your code here
        //str +="*\n";
        //str += "**\n";
        //str +="***\n";
        for (int row = 0; row < height; row++) {
            for (int x = 0; x <= row; x++) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }

    public static String rightRightTriangle(int height) {
        String str = "";
        //add your code here
        for (int meta = 1; meta <= height; meta++) {
            for (int x = height - meta; x > 0; x--) str += " ";
            for (int right = 0; right < meta; right++) str += "*";
            str += "\n";
        }
        return str;
    }

    public static String circle(int radius) {
        String str = "";
        for (int row = radius; row >= -(radius - 1); row--) {
            int verse = (int) Math.sqrt(radius * radius - row * row);
            int mega = verse * 2;
            int fifa = (radius * 2 - mega);
            if (fifa == radius * 2) {
                str += "";
            } else {
                for (int worldcup = 0; worldcup < fifa / 2; worldcup++) {
                    str += " ";
                }
                for (int x = mega; x * 2 > 0; x--) {
                    str += '*';
                }
                str += "\n";
            }


        }
        return str;
    }
}
