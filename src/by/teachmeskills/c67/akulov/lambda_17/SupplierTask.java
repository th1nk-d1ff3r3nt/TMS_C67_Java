package by.teachmeskills.c67.akulov.lambda_17;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierTask {
    private static String reverse(String str){
         Supplier<String> supplier = () -> new StringBuilder(str).reverse().toString();
         return supplier.get();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverse(str));
    }
}
