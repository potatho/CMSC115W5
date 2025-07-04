import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an SSN with dashes: ");
        String ssn = scanner.nextLine();
        
        if (ssn.length() == 11 && ssn.charAt(3) == '-' && ssn.charAt(6) == '-') {
            boolean part1Valid = true;
            for (int i = 0; i < 3; i++) {
                if (!Character.isDigit(ssn.charAt(i))) {
                    part1Valid = false;
                    break;
                }
            }

            boolean part2Valid = true;
            for (int i = 4; i < 6; i++) {
                if (!Character.isDigit(ssn.charAt(i))) {
                    part2Valid = false;
                    break;
                }
            }

            boolean part3Valid = true;
            for (int i = 7; i < 11; i++) {
                if (!Character.isDigit(ssn.charAt(i))) {
                    part3Valid = false;
                    break;
                }
            }

            if (part1Valid && part2Valid && part3Valid) {
                System.out.println(ssn + " is a valid social security number");
            } else {
                System.out.println(ssn + " is an invalid social security number");
            }
        } else {
            System.out.println(ssn + " is an invalid social security number");
        }

    }
}
