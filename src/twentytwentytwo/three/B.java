package twentytwentytwo.three;


import java.util.Scanner;

public class B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int sum = 0;
        while (scanner.hasNextLine()) {
            System.out.println();
            String[] s = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};
            String checked = "";
            for (int i = 0; i < s[0].length(); i++) {
                if (s[1].contains(s[0].charAt(i) + "") && s[2].contains(s[0].charAt(i) + "")) {
                    int temp = 0;
                    checked += s[0].charAt(i) + "";
                    if (s[0].charAt(i) > 96) {
                        temp = (int) (s[0].charAt(i) - 96);
                    } else {
                        temp = (int) (s[0].charAt(i) - 65 + 27);
                    }
                    sum += temp;
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}