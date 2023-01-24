// Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение).
package HW2;

import java.util.Scanner;

public class palindrom {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string: ");

        String str = scan.next();

        System.out.println(palindrom(str));

    }

    private static Boolean palindrom(String str) {

        for (int i = 0; i <= str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {

                return false;

            }

        }

        return true;

    }

}