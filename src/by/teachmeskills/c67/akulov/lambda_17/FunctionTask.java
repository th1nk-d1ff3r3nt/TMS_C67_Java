package by.teachmeskills.c67.akulov.lambda_17;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionTask {
    private static final double USD_EXCHANGE = 2.9830;

    private static boolean userInputCheck(String str) {
        String[] strArr = str.split(" ");
        return ((strArr[0].matches("[0-9].*")) &&
                (Integer.parseInt(strArr[0]) > 0) &&
                ((strArr[1].equals("BYN") || (strArr[1].equals("byn")))));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of BYN (*sum* BYN):");
        String str = scanner.nextLine();
        if (userInputCheck(str)) {
            Function<String, String> convert = str1 -> {
                String[] strArr = str1.split(" ");
                return String.format("%.2f $", (Integer.parseInt(strArr[0]) / USD_EXCHANGE));
            };

            System.out.println(convert.apply(str));
        } else {
            System.out.println("Wrong format!");
        }
    }
}
