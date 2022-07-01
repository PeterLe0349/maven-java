import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class TestMaven {
    public static void main(String[] args) {
        String str = "";
        System.out.print("Enter something: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        System.out.printf("\"You entered: %s\"%n", str);
//        System.out.println(StringUtils.isEmpty(str));
//        Tells whether or not what the user entered is a number
//        ToDone
        System.out.printf("The input is numeric: %s%n", StringUtils.isNumeric(str));
//        Flips the case of the string
//        ToDone
        System.out.printf("The swap case version is: %s%n", StringUtils.swapCase(str));
//        Reverses the string
//        ToDo
        System.out.printf("The reversed version is: %s%n", StringUtils.reverse(str));





    }

}
