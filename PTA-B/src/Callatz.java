import java.util.Scanner;

/**
 * @author lx
 * @create_TIME 2020-02-21-18:58
 */
public class Callatz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int i = in.nextInt();
            if (i > 0 && i <= 1000) {
                System.out.println(soulution(i));
            }
        } catch (
                NullPointerException ex) {
            // gcj Scanner has a bug that throws NPE
            ;
        }
    }

    private static int soulution(int i) {
        int cut = 0;
        while (i != 1) {
            if (i % 2 == 0) {
                i = i / 2;
                cut++;
            } else {
                i = (3 * i + 1) / 2;
                cut++;
            }
        }
        return cut;
    }
}

