package by.teachmeskills.c67.akulov.lambda_17;

import java.time.LocalDate;
import java.util.Scanner;

public class BirthDatePlus100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Birth Date (YYYY-MM-DD):");
        System.out.println(LocalDate.parse(scanner.nextLine()).plusYears(100));
    }
}
